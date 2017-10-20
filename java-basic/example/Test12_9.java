package bitcamp.java100;

public class Test12_9 {
    public static void main(String[] args) {
        char c;

        c = 44032;
        System.out.println(c);
        char a1,a2,a3;
        a1 =0xc774; //c774,cca0,d76c
        a2 =0xcca0;
        a3 =0xd76c;
        System.out.printf("%c %c %c\n",a1,a2,a3);

        char b1 = '이';
        char b2 = '철';
        char b3 = '희';
        System.out.printf("%c %c %c\n",b1,b2,b3);

        char d1 = '7';
        char d2 = '0';
        char d3 = '1';
        int num1 ;
        int num2 ; 
        num1 = d1 - d2;
        num2 = d1 - d3;
        System.out.println(num1);
        System.out.println(num2);
    }

}