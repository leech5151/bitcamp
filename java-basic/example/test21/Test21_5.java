package bitcamp.java100.test21;

import java.io.Console;
import java.text.Format;

public class Test21_5 {

    static class Gugudan {
        int x;
    }
    public static void main(String[] args) {

        
        /////////////////////////////////////////////////////////
        Console console = System.console();

        if(console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }
        ////////////////////////////////////////////////////////
        Gugudan g = new Gugudan();

        g.x = Integer.parseInt(console.readLine("구구단?  "));
        
        if(1 < g.x && g.x < 10) {
            for(int i = 2; i <= g.x; i++) {
                System.out.printf("[%d 단]\n",i);
                for(int j = 1; j < 10; j++) {
                    System.out.printf("%d x %d = %d\n",i,j,i*j);
                }
            }
        }
        else if(g.x < 0) System.out.println("다음에 또 봐요!");
        else System.out.println("2에서 9단까지만 가능합니다!");
    }
}