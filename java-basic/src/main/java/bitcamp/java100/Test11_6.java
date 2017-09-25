package bitcamp.java100;

public class Test11_6 {

    public static void main(String[] args) {
        System.out.println(-21_4748_3648); //10진수 자릿수 표현
        System.out.println(21_4748_3647);

        //System.out.println(-21_4748_3649); //컴파일 오류 크기초과
        //System.out.println(21_4748_3648);
    
        System.out.println(-21_4748_3649L); //대문자L 
        System.out.println(21_4748_3648l); //소문자l 헷갈림

        System.out.println(10); //4바이트 정수값
        System.out.println(10L); //8바이트 정수값
    }
}