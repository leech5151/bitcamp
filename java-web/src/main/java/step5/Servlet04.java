package step5;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step5/Servlet04")
public class Servlet04 extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();

        byte[] bytes = {0x41, 0x42, 0x43, (byte)0xea, (byte)0xb0, (byte)0x80, (byte)0xea, (byte)0xb0, (byte)0x81};
        
        Enumeration<String> names = req.getParameterNames();
        while(names.hasMoreElements()) {
            String name = names.nextElement();
            out.printf("%s: %s\n", name, req.getParameter(name));
        }
    }
}


