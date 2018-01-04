package java100.app.web.v03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
@Controller
@RequestMapping("/v03/test07")
@SessionAttributes({"name", "age"})
public class Test07 {

    //세션 다루기 @SessionAttributes 애노테이션 이용
    @RequestMapping(value="/m1", produces="text/plain;charset=UTF-8")
    public Object m1(Model model) {

        model.addAttribute("name", "홍길동");
        model.addAttribute("age", 20); //객체를 저장
        model.addAttribute("working", true);
       
        return "v03/test07/m1";

    }
    @RequestMapping(value="/m2", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m2(
            @ModelAttribute("name") String name,
            @ModelAttribute("age") int age) {

        StringBuffer buf = new StringBuffer();
        buf.append(String.format("name=%s\n", name));
        buf.append(String.format("age=%d\n", age));
       
        return buf.toString();

    }
    
    @RequestMapping(value="/m3", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m3(@ModelAttribute("age") int age) {

        StringBuffer buf = new StringBuffer();
        buf.append(String.format("age=%d\n", age));
       
        return buf.toString();

    }
    @RequestMapping(value="/m4", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m4(@ModelAttribute("working") String working) {

        StringBuffer buf = new StringBuffer();
        buf.append(String.format("working=%s\n", working));
       
        return buf.toString();

    }
    @RequestMapping(value="/m5", produces="text/plain;charset=UTF-8")
    public Object m5() {
        return "v03/test07/m1";

    }
}

