//: ## ver 26
//: - 코드 리팩토링3
//: - 학습목표
//:   - 역할에 따라 클래스를 여러 패키지에 분류하는 것을 연습한다.
//: 
package java100.app;

import java.util.HashMap;
import java.util.Scanner;

import java100.app.control.BoardController;
import java100.app.control.GenericController;
import java100.app.control.MemberController;
import java100.app.control.ScoreController;

public class App {
    
	static Scanner keyScan = new Scanner(System.in);
	static HashMap<String, GenericController<?>> controllerMap = new HashMap<>();
    
    public static void main(String[] args) {
    	controllerMap.put("1", new ScoreController());
    	controllerMap.put("2", new MemberController());
    	controllerMap.put("3", new BoardController());
        
        loop:
        while (true) {
            System.out.print("명령> ");
            String[] input = keyScan.nextLine().toLowerCase().split(" ");
            
            try {
                switch (input[0]) {
                case "menu": doMenu(); break;
                case "help": doHelp(); break;
                case "quit": doQuit(); break loop;
                case "go": doGo(input[1]); break;
                default:
                    doError();
                }
            } catch (Exception e) {
                System.out.println("명령 처리 중 오류 발생!");
                e.printStackTrace();
            }
            System.out.println();
        } // while
        
    }
    
    private static void doGo(String menuNo) {
        GenericController<?> controller = controllerMap.get(menuNo);
        
        if(controller == null) {
        	System.out.println("해당 번호의 메뉴가 없습니다.");
        	return;
        }
        controller.execute();
    }

    private static void doHelp() {
        System.out.println("[명령]");
        System.out.println("menu        - 메뉴 목록 출력한다.");
        System.out.println("go 번호     - 메뉴로 이동한다.");
        System.out.println("quit        - 프로그램을 종료한다.");
    }

    private static void doMenu() {
        System.out.println("1 성적관리");
        System.out.println("2 회원관리");
        System.out.println("3 게시판");
    }

    private static void doError() {
        System.out.println("실행할 수 없는 명령입니다.");
    }

    private static void doQuit() {
        System.out.println("프로그램을 종료합니다.");
    }




        
}




