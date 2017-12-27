package java100.app.web.v03;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/v03/test03")
public class Test03 {

    @RequestMapping("/m1")
    public String m1(HttpServletRequest request) {
        request.setAttribute("member", new Member("홍길동",20, true));
        return "v03/test03";
    }
    
    @RequestMapping("/m2")
    public String m2(Map map) {
        map.put("member", new Member("홍길동",20, true));
        return "v03/test03";
    }
    @RequestMapping("/m3")
    public String m3(Model model) {
        model.addAttribute("member", new Member("홍길동",20, true));
        return "v03/test03";
    }
    @RequestMapping("/m4")
    public Map m4() {
        Map map = new HashMap();
        map.put("member", new Member("홍길동",20, true));
        return map;
    }
    @RequestMapping("/m5")
    public Model m5() {
        Model model = new ConcurrentModel();
        model.addAttribute("member", new Member("홍길동",20, true));
        return model;
    }
    @RequestMapping("/m6")
    public ModelAndView m6() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("member", new Member("임꺽정",20, true));
        mv.setViewName("v03/test03");
        return mv;
    }
}

