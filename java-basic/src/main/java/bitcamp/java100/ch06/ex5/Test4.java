package bitcamp.java100.ch06.ex5;
import java.util.Scanner;

public class Test4 {

    static boolean confirm(String message) {
        Scanner keyScan = new Scanner(System.in);
        System.out.println(message);
        String respones = keyScan.nextLine().toLowerCase();

        if(respones.equals("y") || respones.equals("yes"))
            return true;
        return false;
    }

    public static void main(String[] args) {
        while(true) {
            Score1.inputScore();
            Score1.computeScore();
            Score1.printScore();

            if(!confirm("다시 ㄱ ? "))
                break;
        }
    }
}
