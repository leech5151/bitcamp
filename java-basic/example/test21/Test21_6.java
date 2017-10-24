package bitcamp.java100.test21;

import java.io.Console;

public class Test21_6 {

    public static void main(String[] args) {

        class Number {
            long v =0;
            int[] arr = new int[10];
        }
        /////////////////////////////////////////////////////////
        Console console = System.console();

        if(console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }
        ////////////////////////////////////////////////////////

        Number n = new Number();

        n.v = Long.parseLong(console.readLine("숫자?  "));

        while (n.v > 0) {
            n.arr[(int)(n.v % 10)]++;
            n.v /= 10;
        }
        
        for(int j = 0; j < 10; j++) {
            System.out.printf("%d : %d개\n",j,n.arr[j]);
        }


    }
}
