package bitcamp.java100.ch06.ex3;

public class Test7 {

    static class A{
        static int a = 100;
        static {
            System.out.println("A의 스태틱 블록 실행!");
            System.out.printf("A===> a = %d\n",a);
            B.b = 222;
            System.out.printf("A===> a = %d\n",a);
            System.out.println("A의 스태틱 블록 종료!");
            System.out.printf("B===> b = %d\n",B.b);
        }
    }
    static class B{
        static int b = 200;
        static {
            System.out.println("B의 스태틱 블록 실행!");
            System.out.printf("B===> b = %d\n",b);
            A.a = 111;
            System.out.printf("B===> b = %d\n",b);
            System.out.println("B의 스태틱 블록 종료!");
        }
    }
    public static void main(String[] args) {
        new A();
        
    }
}


