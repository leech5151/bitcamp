package bitcamp.java100;

import java.io.Console;
import java.text.Format;

public class Test21_7 {

    public static void main(String[] args) {

        /////////////////////////////////////////////////////////
        Console console = System.console();

        if(console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }
        ////////////////////////////////////////////////////////
        
        String word = console.readLine("문자열? ");
        
        for(int i = word.length()-1; i >=0; i--) {
            System.out.print(word.charAt(i));
        }
    }
}
