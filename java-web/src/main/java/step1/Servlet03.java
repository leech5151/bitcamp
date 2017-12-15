package step1;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

// @WebServlet({"step1/Servlet03")
public class Servlet03 implements javax.servlet.Servlet {
    ServletConfig  config;
    public Servlet03() {
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }
    @Override
    public void destroy() {
    }
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("3333333333333333");
    }
    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }
    @Override
    public String getServletInfo() {
        return "Serlet03- XML 파일에 서블릿 배치";
    }
}


