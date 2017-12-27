package java100.app.web.ex1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ex1/test00")
public class Test00 {
    
    @RequestMapping(params="menu")
    public String menu() {
        System.out.println("menu()");
        return "/hello.jsp";
    }
    @RequestMapping(params= {"a","b"})
    public String ab() {
        System.out.println("ab()");
        return "/hello.jsp";
    }
}
