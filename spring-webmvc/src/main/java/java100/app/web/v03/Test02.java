package java100.app.web.v03;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/v03/test02")
public class Test02 {

    @RequestMapping("/m1")
    @ResponseBody
    public String m1() {
        return "hello";
    }
    @RequestMapping("/m2")
    @ResponseBody
    public String m2(HttpServletResponse response) {

        response.setContentType("text/plain;charset=UTF-8"); // 안된다
        response.setHeader("Content-Type", "text/plain;charset=UTF-8"); // 안된다!
        return "한글";
    }
    @RequestMapping(value="/m3", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m3() {
        return "한글";
    } 
    @RequestMapping(value="/m4")
    @ResponseBody
    public HttpEntity<String> m4() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/plain;charset=UTF-8");
        HttpEntity<String> entity = new HttpEntity<>("한글!",headers);

        return entity;
    } 
    @RequestMapping(value="/m5")
    public ResponseEntity<String> m5() {

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/plain;charset=UTF-8");
        ResponseEntity<String> entity = new ResponseEntity<>("한글!",headers, HttpStatus.OK);

        return entity;
    } 

    public static class Member{
        String name;
        int age;
        boolean working;
        
        public Member(String name, int age, boolean working) {
            this.name = name;
            this.age  = age;
            this.working = working;
        }
        
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public boolean isWorking() {
            return working;
        }
        public void setWorking(boolean working) {
            this.working = working;
        }
        
       
    }
    
    @RequestMapping(value="/m6")
    @ResponseBody
    public Object m6() {
        return new Member("호길동",20,false);
    } 

}
