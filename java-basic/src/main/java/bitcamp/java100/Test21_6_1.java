package bitcamp.java100;

import java.io.Console;

public class Test21_6_1 {
    static Console console;
    static void prepareInput() {
        console = System.console();

        if(console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }
    }

    static long NumberInput() {
        return Long.parseLong(console.readLine("숫자?  "));
    }

    static int[] countNumbers(long v) {
        int[] arr = new int[10];

        while (v > 0) {
            arr[(int)(v % 10)]++;
            v /= 10;
        }
        return arr;
    }

    static void NumberPrint(int[] arr) {
        for(int j = 0; j < 10; j++) {
            System.out.printf("%d : %d개\n",j,arr[j]);
        }
    }

    public static void main(String[] args) {
        prepareInput();

        long v = NumberInput();
        int[] arr = countNumbers(v);
        NumberPrint(arr);
    }
}



