package bitcamp.java100;

public class Test11_8 {

    public static void main(String[] args) {
        //고정 소수점의 값을 표현하는 방법
        System.out.println(3.14);
        System.out.println(.14);
        System.out.println(3.);

        //부동 소수점의 값을 표현하는 방법
        System.out.println(31.4e-1); // e-1 = 10**-1을 곱하라
        System.out.println(314e-2);
        System.out.println(3140e-3);
        System.out.println(0.314e1);
        System.out.println(0.0314e2);
    }
}