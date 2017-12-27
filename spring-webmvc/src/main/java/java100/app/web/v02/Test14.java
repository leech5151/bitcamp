package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test14")
public class Test14 {


    @RequestMapping
    public String fileupload(
            String name,
            String[] langs) {
        System.out.println(name);

        if(langs != null) {

            for(String lang : langs) {
                System.out.println(lang);
            }
        }

        return "/hello.jsp";
    }
}
