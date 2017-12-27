package step12;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
    @WebServlet("/step12/Servlet05")
public class Servlet05 extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession();
        
        String working = req.getParameter("working");
        
        if(working != null) {
            session.setAttribute("working", working); 
        } else {
            session.removeAttribute("working");
        }
        
        res.setContentType("text/plain);charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.println("세션을 무효화했습니다!");
    }
}


