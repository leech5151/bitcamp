package bitcamp.java100.test21;

import java.io.Console;
import java.text.Format;

public class Test21_4 {

    public static void main(String[] args) {

        class Student {
            String name;
            int age;
            boolean working;
            float gpa;

        }
        Console console = System.console();

        if(console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }
        ////////////////////////////////////////////////////////

        Student s = new Student();

        s.name = console.readLine("이름?( 예 : 홍길동 ) ");
        s.age = Integer.parseInt(console.readLine("나이?( 예 : 21 ) "));
        s.working = Boolean.parseBoolean(console.readLine("재직여부?( 예 : true/false )" ));
        s.gpa = Float.parseFloat(console.readLine("학점?( 예 : 3.5 ) "));

        System.out.printf("이름 : %s\n", s.name);
        System.out.printf("나이 : %d\n", s.age);
        System.out.printf("재직여부 : %b\n", s.working);
        System.out.printf("졸업학점 : %.2f\n", s.gpa);

    }
}