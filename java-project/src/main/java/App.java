import java.util.Scanner;

public class App {
    static Scanner keyScan = new Scanner(System.in);
    

    static boolean confirm(String message) {
        
        System.out.println(message);
        String respones = keyScan.nextLine().toLowerCase();

        if(respones.equals("y") || respones.equals("yes"))
            return true;
        return false;
    }

    public static void main(String[] args) {

        Score[] scores = new Score[100];
        int cursor = 0;
        
        while(true) {
            Score score = new Score();
            scores[cursor++] = score;

            if(!confirm("계속하시겠습니까? ")) {
                break;
            }
        }
        for(int i = 0; i < cursor; i++) {
            scores[i].print();
        }
    }
}




