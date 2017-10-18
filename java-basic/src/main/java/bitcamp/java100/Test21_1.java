package bitcamp.java100;

import java.util.Scanner;

public class Test21_1 {

    public static void main(String[] args) {



        Scanner keyScan = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String line = keyScan.nextLine();
        
        System.out.printf("당신의 이름은 %s 입니다.",line);
        
        keyScan.close();

    }
}