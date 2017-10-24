package bitcamp.java100.test21;

import java.io.Console;

public class Test21_6_2 {
    static Console console;
    static void prepareInput() {
        console = System.console();

        if(console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }
    }

    static StringBuffer NumberInput() {
        StringBuffer buf = new StringBuffer(console.readLine("숫자? "));
        return buf;
    }
    
    static int[] NumberCount(StringBuffer buf) {
        int[] cnt = new int[10];
        
        for(int i = 0; i < buf.length(); i++) {
            cnt[buf.charAt(i) - '0']++;
        }
        return cnt;
    }
    
    static void NumberPrint(int[] cnt) {
        for(int i = 0; i < cnt.length; i++) {
            System.out.printf("%d = %d\n",i ,cnt[i]);
        }
    }
    
    public static void main (String[] args) {
        prepareInput();

        StringBuffer buf = NumberInput();
        int[] cnt = NumberCount(buf);
        NumberPrint(cnt);
    }
}



