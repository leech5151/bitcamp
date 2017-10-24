package bitcamp.java100.test21;

import java.io.Console;
import java.text.Format;

public class Test21_3 {

    public static void main(String[] args) {

        Console console = System.console();
        
        if(console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }
        ////////////////////////////////////////////////////////
        
        String name;
        int age;
        boolean working;
        float gpa;

        name = console.readLine("이름?( 예 : 홍길동 ) ");
        age = Integer.parseInt(console.readLine("나이?( 예 : 21 ) "));
        working = Boolean.parseBoolean(console.readLine("재직여부?( 예 : true/false )" ));
        gpa = Float.parseFloat(console.readLine("학점?( 예 : 3.5 ) "));
        
        System.out.printf("이름 : %s\n", name);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("재직여부 : %b\n", working);
        System.out.printf("졸업학점 : %.2f\n", gpa);
        

        Integer i = new Integer(100); // x
        
        Integer i2 = Integer.valueOf(100); // o
    }
}