package bitcamp.java100.ch21.ex5;

import org.springframework.stereotype.Component;

@Component
public class X {
    public String m1(String name) {
        System.out.println("X.m1()");
        if (name == null ) {
            throw new RuntimeException("이름이 있습니다.");
        }
        return name + "님 반갑습니다.";
    }
}