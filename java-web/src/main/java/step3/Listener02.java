package step3;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class Listener02 implements ServletRequestListener{

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        
        System.out.println("Lstener02.requestDestroyed()");
        
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Lstener02.requestInitialized()");
        
    }

}
