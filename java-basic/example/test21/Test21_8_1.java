package bitcamp.java100.test21;

import java.io.Console;
import java.text.Format;
import java.util.ArrayList;

public class Test21_8_1 {
    static Console console = System.console();
    static void prepareInput() {
        console = System.console();

        if(console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }
    }
    static class Impormation {
        String name ;
        String mail ;
        String number ;
        
    }
    static Impormation inputMember(Impormation i, ArrayList names, ArrayList mails, ArrayList numbers) {
        i.name = console.readLine("이름? ");
        i.mail = console.readLine("메일? ");
        i.number = console.readLine("전화? ");
        if(console.readLine("저장하시겠습니까? (y/n) ").equals("y") == true) {
            names.add(i.name);
            mails.add(i.mail);
            numbers.add(i.number);
            System.out.println("저장하였습니다");
        }
        else System.out.println("저장을 취소하셨습니다.");

        return i;
    }
    static void printMember(ArrayList names, ArrayList mails, ArrayList numbers) {
        for(int x = 0; x < names.size(); x++) {
            System.out.printf("%s\t",names.get(x));
            System.out.printf("%s ",mails.get(x));
            System.out.printf("%s\n",numbers.get(x));
        }
    }


    public static void main(String[] args) {
        prepareInput();
        
        Impormation i = new Impormation();
        ArrayList names = new ArrayList();
        ArrayList mails = new ArrayList();
        ArrayList numbers = new ArrayList();


        while(true) {
            inputMember(i, names, mails, numbers);
            if(console.readLine("계속하시겠습니까?? (y/n) ").equals("y") == true) continue;
            else break;
        }
        System.out.println();
        printMember(names, mails, numbers);

    }
}
