package java100.app.web.v03;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
@Controller
@RequestMapping("/v03/test08")
@SessionAttributes({"name", "age"})
public class Test08 {

    //세션 무효화시키기
    @RequestMapping(value="/m1", produces="text/plain;charset=UTF-8")
    public Object m1(HttpSession session, Model model) {

        model.addAttribute("name", "홍길동");
        model.addAttribute("age", 20); 
        model.addAttribute("working", true);
        
        session.setAttribute("working", true);
       
        return "v03/test08/m1";

    }
    @RequestMapping(value="/m2", produces="text/plain;charset=UTF-8")
    public Object m2(HttpSession session) {

        session.invalidate(); //session.setAttribute() 로 추가한 값 모두 제거
        
        return "v03/test08/m1";

    }
    
    @RequestMapping(value="/m3", produces="text/plain;charset=UTF-8")
    public Object m3(SessionStatus status) {
        
        status.setComplete(); // @SessionAttrubutes로 지정한 값만 제거한다.
        
        return "v03/test08/m1";
    }
    @RequestMapping(value="/m4", produces="text/plain;charset=UTF-8")
    public Object m4(HttpSession session, SessionStatus status) {
        
        session.invalidate(); //session.setAttribute() 로 추가한 값 모두 제거
        status.setComplete(); // @SessionAttrubutes로 지정한 값만 제거한다.
        
        return "v03/test08/m1";

    }
}

