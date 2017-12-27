package java100.app.servlet;

import static org.reflections.ReflectionUtils.*;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.common.reflect.Parameter;

import java100.app.annotation.RequestMapping;
import java100.app.annotation.RequestParam;
import java100.app.listener.ContextLoaderListener;


@WebServlet("*.do")
@SuppressWarnings("serial")
public class DispatcherServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pageControllerPath = request.getServletPath().replace(".do", "");

        Object pageController = 
                ContextLoaderListener.iocContainer.getBean(pageControllerPath);

        if(pageController == null) {
            throw new ServletException("페이지 컨트롤러를 찾을 수 없습니다.");
        }
        
        @SuppressWarnings("unchecked")
        Set<Method> methods = getMethods(pageController.getClass(),
                withAnnotation(RequestMapping.class)) ;
        
        if(methods.size() == 0) {
            throw new ServletException("페이지 컨트롤러의 요청 핸들러를 찾을 수 없습니다.");
        }
        
        Method requestHandler = (Method)methods.toArray()[0];
        
        Object[] paramValues = getParamValuesFor(requestHandler, request, response);
        try {
            String viewName = (String)requestHandler.invoke(pageController,  request, response);
            

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

    private Object[] getParamValuesFor(
            Method method, HttpServletRequest request, HttpServletResponse response) {

        Parameter[] params = method.getParameters();
        Object[] values = new Object[params.length];
        
        for (int i = 0; i < params.length; i++) {
            if(params[i].getType() == HttpServletRequest.class) {
                values[i] = request;
            } else if (params[i].getType() == HttpServletResponse.class) {
                values[i] = response;
            } else {
                RequestParam anno = params[i].getAnnotation(RequestParam.class);
                
                if (anno != null) {
                    // 애노테이션의 value 값으로 클라이언트가 보낸 값을 찾는다.
                    String value = request.getParameter(anno.value());
                    values[i] = toParamTypeValue(params[i], value);
                } else {
                    // @RequestParam이 붙지 않았다면,
                    // 해당 파라미터 타입을 분석하여 객체를 생성한 후
                    // 그 객체에 값을 넣어서 배열에 저장한다.
                    values[i] = toParamTypeObject(params[i], request);
                }
            }
        }
        return values;
    }

    private Object toParamTypeObject(Parameter parameter, String value) {
        Class<?> clazz = parameter.getType();

        try {
            Object obj = clazz.newInstance();
            @SuppressWarnings("unchecked")
            Set<Method> setters = getMethods(clazz, 
                    withPrefix("set"), withParametersCount(1));
            for (Method setter : setters) {

                // 셋터의 이름에서 프로퍼티 이름을 추출한다.
                String propName = getPropertyName(setter);

                // 그 프로퍼티 이름으로 클라이언트가 보낸 데이터를 찾는다.
                String value = request.getParameter(propName);

                // 셋터가 원하는 파라미터의 값을 클라이언트가 보내지 않았으면,
                // 셋터를 호출하지 않는다.
                if (value == null) continue;

                // 프로퍼티 이름에 해당하는 클라이언트가 보낸 값이 있다면
                // 셋터 메서드를 호출하여 값을 객체에 담는다.
                Parameter param = setter.getParameters()[0];
                Object paramValue = toParamTypeValue(param, value);

                // String 값을 바꾸지 못했으면 셋터가 원하는 타입의 값으로 
                // 바꾸지 못했으면 셋터를 호출하지 않는다.
                if (paramValue == null) continue;  

                setter.invoke(obj, paramValue);
            }
            return obj;
        } catch (Exception e) {
            return null;
        }
    }
    private String getPropertyName(Method method) {
        String name = method.getName().replace("set", "");
        return String.format("%c%s", 
                Character.toLowerCase(name.charAt(0)),
                name.substring(1));
    }
    private Object toParamTypeValue(Parameter param, String value) {

        Class<?> type = param.getType();

        // 파라미터의 타입에 따라 String 값을 그 타입의 값으로 형변환한다.
        if (type == byte.class) {
            return Byte.parseByte(value);
        } else if (type == short.class) {
            return Short.parseShort(value);
        } else if (type == int.class) {
            return Integer.parseInt(value);
        } else if (type == long.class) {
            return Long.parseLong(value);
        } else if (type == float.class) {
            return Float.parseFloat(value);
        } else if (type == double.class) {
            return Double.parseDouble(value);
        } else if (type == boolean.class) {
            return Boolean.parseBoolean(value);
        } else if (type == char.class) {
            return value.charAt(0);
        } else if (type == String.class){
            return value;
        } else {
            return null;
        }
    }
}