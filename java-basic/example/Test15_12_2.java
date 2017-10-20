package bitcamp.java100;

public class Test15_12_2 {

    public static void main(String[] args) {
        // ### 문제 : int 메모리의 들어 있는 값을 1바이트 씩 앞에서 부터 출력하라
        int v = 1234567890;
        
        System.out.println(Integer.toHexString(v));
        
        System.out.println(Integer.toHexString(v >> 24));
        System.out.println(Integer.toHexString((v >> 16) & 0xff));
        System.out.println(Integer.toHexString((v >> 8) & 0xff));
        System.out.println(Integer.toHexString((v) & 0xff));
        
    }
}
