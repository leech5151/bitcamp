package java100.app.servlet;

import static org.reflections.ReflectionUtils.*;

import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.reflections.ReflectionUtils;

import java100.app.annotation.RequestMapping;
import java100.app.annotation.RequestParam;
import java100.app.listener.ContextLoaderListener;
@WebServlet("*.do")
@SuppressWarnings("serial")
public class DispatcherServlet extends HttpServlet {

    @SuppressWarnings("unused")
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pageControllerPath = request.getServletPath().replace(".do", "");

        Object pageController = ContextLoaderListener.iocContainer.getBean(pageControllerPath);

        if (pageController == null) {
            throw new ServletException("페이지 컨트롤러를 찾을 수 없습니다.");
        }
        @SuppressWarnings("unchecked")
        Set<Method> methods = getMethods(pageController.getClass(), withAnnotation(RequestMapping.class));

        if (methods.size() == 0) {
            throw new ServletException("페이지 컨트롤러의 요청 핸들러를 찾을 수 없습니다.");
        }
        
        Method requestHandler = (Method)methods.toArray()[0];
        
        if(pageController == null) {
            throw new ServletException("해당 서블릿을 찾을 수 없습니다.");
        }
        
        Object[] paramValues = getParamValuesFor(requestHandler, request, response);
        
        try {
            String viewName = (String)requestHandler.invoke(pageController, paramValues);

            if(viewName.startsWith("redirect:")) {
                response.sendRedirect(viewName.substring(9));
                return;
            } else {
                response.setContentType("text/html;charset=UTF-8");
               
                RequestDispatcher rd = request.getRequestDispatcher(viewName);
                rd.include(request, response);
            }
        } catch(Exception e) {
            throw new ServletException(e);
        }
    }

    private Object[] getParamValuesFor(Method method, HttpServletRequest request, HttpServletResponse response) {
        Parameter[] params = method.getParameters();    
        Object[] values = new Object[params.length];
        
        for (int i = 0; i < params.length; i++) {
            if(params[i].getType() == HttpServletRequest.class) {
                values[i] = request;
            } else if (params[i].getType() == HttpServletResponse.class) {
                values[i] = response;
            } else {
                RequestParam anno = params[i].getAnnotation(RequestParam.class);
                
                if(anno != null) {
                    String value = request.getParameter(anno.value());
                    values[i] = toParamTypeValue(params[i], value);
                } else {
                    values[i] = toParamTypeValueObject(params[i], request);
                }
            }
        }
        return values;
    }
    @SuppressWarnings("unchecked")
    private Object toParamTypeValueObject(Parameter parameter, HttpServletRequest request) {

        Class<?> clazz = parameter.getType();
        try {
            Object obj = clazz.newInstance();
            Set<Method> setters = getMethods(clazz, withPrefix("set"), withParametersCount(1));
            
            for (Method setter : setters) {
                String propName = getPropertyName(setter);
                String value = request.getParameter(propName);
                if(value == null) continue;
                
                Parameter param = setter.getParameters()[0];
                Object paramValue = toParamTypeValue(param, value);
                if(paramValue == null) continue;
                setter.invoke(obj, paramValue);
            }
            return obj;
        } catch (Exception e) {
            return null;
        }
    }
    
    private String getPropertyName(Method method) {
        String name = method.getName().replace("set", "");
        return String.format("%c%s", Character.toLowerCase(name.charAt(0)), name.substring(1));
        
    }

    private Object toParamTypeValue(Parameter param, String value) {
        
        Class<?> type = param.getType();
        
        if(type == byte.class) {
            return Byte.parseByte(value);
        } else if (type == short.class) {
            return Short.parseShort(value);
        }else if (type == int.class) {
            return Integer.parseInt(value);
        }else if (type == long.class) {
            return Long.parseLong(value);
        }else if (type == float.class) {
            return Float.parseFloat(value);
        }else if (type == double.class) {
            return Double.parseDouble(value);
        }else if (type == boolean.class) {
            return Boolean.parseBoolean(value);
        }else if (type == char.class) {
            return value.charAt(0);
        }else if (type == String.class) {
            return value;
        }else {
            return null;
        }
    }
}