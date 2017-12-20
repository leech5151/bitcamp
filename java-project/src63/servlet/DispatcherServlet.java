package java100.app.servlet;

import static org.reflections.ReflectionUtils.getMethods;
import static org.reflections.ReflectionUtils.withAnnotation;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.annotation.RequestMapping;
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
        try {
            String viewName = (String)requestHandler.invoke(pageController, request, response);

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
}