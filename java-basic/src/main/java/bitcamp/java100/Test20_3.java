
package bitcamp.java100;

import java.io.File;

public class Test20_3 {

    static void print1(String value) {
        System.out.println(value);
    }
    static void print2(int value) {
        System.out.println(value);
    }
    static void print3(float value) {
        System.out.println(value);
    }
    
    static void print4(Object value) {
        System.out.println(value);
    }
    public static void main(String[] args) {
        
        print1("문자열");
        print2(300);
        print3(3.14f);
        
        String v1 = "홍길동";
        StringBuffer v2 = new StringBuffer("임꺽정");
        File v3 = new File(".");
        System.out.println("----------------------------");
        print1(v1);
        //print2(v2);
        //print3(v2);
        System.out.println("----------------------------");
        print4(v1);
        print4(v2);
        print4(v3);
        System.out.println("----------------------------");
        print4("백문이불여일실행");
        print4(400);
        print4(2.32f);
    }
}   
