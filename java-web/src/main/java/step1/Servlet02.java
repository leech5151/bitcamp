package step1;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet({"/step1/Servlet02","/servlet02","/ohora"})
public class Servlet02 implements javax.servlet.Servlet {
    ServletConfig  config;
    public Servlet02() {
        System.out.println("step1.Servlet02.Servlet02()");
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        System.out.println("step01.Servlet02.init()");
    }
    @Override
    public void destroy() {
        System.out.println("step01.Servlet02.destory()");
    }
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("step.Servlet02.service()");
    }
    @Override
    public ServletConfig getServletConfig() {
        System.out.println("step.Servlet02.service()");
        return this.config;
    }
    @Override
    public String getServletInfo() {
        System.out.println("step.Servlet01.service()");
        return "Serlet02- 서블릿 배치 URL";
    }
}


