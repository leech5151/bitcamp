package bitcamp.java100.test21;

import java.io.Console;

public class Test21_5_X {
    
    static class ConsoleCreationException extends RuntimeException{
    }
    static class InvalidGugudanException extends RuntimeException{
    }
    
    static Console console = System.console();
    static void prepareInput() {
        console = System.console();
        if (console == null) {
            throw new RuntimeException("콘솔 생성 오류!");
        }
    }
    
    static int inputGugudan() {
        int i = Integer.parseInt(console.readLine("구구단? => "));
        
        if(i > 9 || i < 0 || i == 1) {
            throw new InvalidGugudanException();
        }
        return i;
    }
    
    static void printGugudan(int i) {
        for (int j = 1; j < 10; j++) {
            System.out.printf("%d * %d = %d\n", i, j, i*j);
        }
    }

    public static void main(String[] args) {
        prepareInput();
        
        int i = inputGugudan();

        if (i >= 10 || i == 1) System.out.println("2에서 9단까지만 가능합니다!");
        else if (i == 0) System.out.println("다음에 또 봐요!");

        printGugudan(i);
    }
}

