package step2;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

public abstract class AbstractServlet implements Servlet {
    ServletConfig  config;
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }
    @Override
    public void destroy() {
    }
    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }
    @Override
    public String getServletInfo() {
        System.out.println("step.Servlet01.service()");
        return this.getClass().getName();
    }
}
