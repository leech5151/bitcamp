package bitcamp.java100.ch06.ex5;
import java.util.Scanner;

public class Test5 {

    static boolean confirm(String message) {
        Scanner keyScan = new Scanner(System.in);
        System.out.println(message);
        String respones = keyScan.nextLine().toLowerCase();

        if(respones.equals("y") || respones.equals("yes"))
            return true;
        return false;
    }

    public static void main(String[] args) {

        Score2[] scores = new Score2[100];
        int cursor = 0;

        while(true) {
            Score2 score = new Score2();
            score.input();
            scores[cursor++] = score;

            if(!confirm("다시ㄱ ? "))
                break;
        }
        for(int i = 0; i < cursor; i++) {
            scores[i].print();
        }
    }
}
