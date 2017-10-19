package bitcamp.java100;

import java.io.Console;
import java.text.Format;

public class Test21_7_1 {
    static Console console = System.console();
    static void prepareInput() {
        console = System.console();

        if(console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }
    }
    static String inputWord() {
        String word = console.readLine("문자열? ");
        return word;
    }
    static void printWord(String word) {
        for(int i = word.length()-1; i >=0; i--) {
            System.out.print(word.charAt(i));
        }
    }
    
    public static void main(String[] args) {
        prepareInput();
        
        String word = inputWord();
        printWord(word);
        
        
    }
}
