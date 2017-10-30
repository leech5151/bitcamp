package bitcamp.java100.ch07.ex5;

public class A {
   // A() {
   //     super();
   // }
    
    A() {
        //super();
        System.out.println("A() 생성자 실행_!");
        
    }
    
    A(String str) {
        super();
        System.out.println("A(String) 생성자 실행됨");
    }
    A(int i) {
        
        System.out.println("A(int) 생성자 실행됨");
        // super();
    }
}
