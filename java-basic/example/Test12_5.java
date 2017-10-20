package bitcamp.java100;

public class Test12_5 {
    public static void main(String[] args) {
        byte b1;     // 1 byte 크기의 메모리 
        short s;    // 2 byte 크기의 메모리
        int i;      // 4 byte 크기의 메모리
        long l;     // 8 byte 크기의 메모리
        b1=100;
        
        b1=-128;
        b1=127;

        s = Short.MIN_VALUE;
        System.out.println(s);
        s = 32767;

        i = -21_4748_3648;
        System.out.println(i);
        i = Integer.MAX_VALUE;
        System.out.println(i);

        l = Long.MIN_VALUE;
        System.out.println(l);
        l = Long.MAX_VALUE;
        System.out.println(l);


        l=100l;
        System.out.println(l);
        l=1000;
        System.out.println(l);
        
    }
}