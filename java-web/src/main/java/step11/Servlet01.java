package step11;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
    @WebServlet("/step11/Servlet01")
public class Servlet01 extends HttpServlet {

    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        Cookie cookie = new Cookie("name","hong");
        res.addCookie(cookie);
        
        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.printf("%s,%s\n",cookie.getName(),cookie.getValue());
    }
}


