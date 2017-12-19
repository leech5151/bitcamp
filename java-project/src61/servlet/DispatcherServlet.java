package java100.app.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
@SuppressWarnings("serial")
public class DispatcherServlet extends HttpServlet {
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pageControllerPath = request.getServletPath().replace(".do", "");
        
        RequestDispatcher rd = request.getRequestDispatcher(pageControllerPath);
        rd.include(request, response);
        
        String viewName = (String)request.getAttribute("viewName");
        
        if(viewName.startsWith("redirect:")) {
            response.sendRedirect(viewName.substring(9));
            return;
        } else {
            response.setContentType("text/html;charset=UTF-8");
            rd = request.getRequestDispatcher(viewName);
            rd.include(request, response);
        }
    }
}