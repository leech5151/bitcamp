package java100.app.web.v03;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/v03/test06")
public class Test06 {

    //세션 준비하고 값 저장하기
    @RequestMapping(value="/m1", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public Object m1(HttpSession session) {

        session.setAttribute("name", "홍길동");
        session.setAttribute("age", 20); //객체를 저장
        session.setAttribute("working", true);
        return "세션에 값을 저장하였음.";
    }
    
    @RequestMapping(value="/m2", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public Object m2(HttpSession session) {

        StringBuffer buf = new StringBuffer();
        buf.append(String.format("name=%s\n", session.getAttribute("name")));
        buf.append(String.format("age=%d\n", session.getAttribute("age")));
        buf.append(String.format("working=%b\n", session.getAttribute("working")));
        
        return buf.toString();
    }
    
}

