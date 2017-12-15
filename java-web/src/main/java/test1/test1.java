package test1;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/test1/test1")
public class test1 implements Servlet{
    ServletConfig config;
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("test1.service()");
    }

    @Override
    public String getServletInfo() {
        // TODO Auto-generated method stub
        return "시험중입니다.";
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
    
}
