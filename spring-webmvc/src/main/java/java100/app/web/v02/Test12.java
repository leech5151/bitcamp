package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test12")
public class Test12 {
    
    
    @RequestMapping("m1")
    public String m1(String name, int age, boolean working, float height) {
        System.out.println(name);
        System.out.println(age);
        System.out.println(working);
        System.out.println(height);
        System.out.println("-----------------------");
        return "/hello.jsp";
    }

    @RequestMapping("m2")
    public String m2(java.util.Date birthDate) {
        System.out.println(birthDate);
        System.out.println("-----------------------");
        return "/hello.jsp";
    }
    
    
    // 프론트 컨트롤러(DispathcerServlet)는 클라이언트로 부터 요청이 들어오면 클라이언트가 보낸 데이터를
    // 적절하게 변환하기 위해 변환기를 셋팅한다. 이것을 Web Data binding 이라 한다.
    // 스프링은 문자열을 primitive 타입으로 바꿀 수 있도록 기본 변환기를 제공한다.
//    @InitBinder
//    protected void initBinder(WebDataBinder binder) {
//        System.out.println("initBinder()");
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        dateFormat.setLenient(false);
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
//    }
}
