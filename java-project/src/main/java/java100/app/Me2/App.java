package java100.app.Me2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {
	static Scanner keyScan = new Scanner(System.in);
	static String name = null;

	public static void main(String[] args) {
		ScoreController scorecontroller = new ScoreController();

		loop:
			while(true) {
				System.out.print("명령> ");
				String common = keyScan.nextLine();


				switch(common){
				case "menu" : System.out.printf("1 성적관리\n2 회원관리\n3 게시판\n"); break;
				case "go 1" :
				case "go 2" :
				case "go 3" :

				case "help" : System.out.println("명령을 실행할 때는 'go 번호를 입력하세요\n"
						+ " 예를들어 [성적관리] 메뉴를 실행하고 싶다면 'go 1'이라고 입력하세요.");
				break;
				case "ok" : System.out.println("잘못된 명령입니다."); break;
				case "quit": doQuit(); break loop;

				}
			}
		loop:
			while(true) {
				System.out.print("성적관리> ");
				String input = keyScan.nextLine();

				switch(input) {
				case "add" : scorecontroller.doAdd(); break;
				case "list" : scorecontroller.doList(); break;
				case "view" : scorecontroller.doView(); break;
				case "update" : scorecontroller.doUpdate(); break;
				case "delete" : scorecontroller.doDelete(); break;
				case "quit": doQuit(); break loop;
				default : doError();
				}
				System.out.println();
			}

	}

	private static void doError() {
		System.out.println("[실행할 수 없는 명령입니다.]");
	}

	private static void doQuit() {
		System.out.println("[프로그램을 종료 합니다.]");
	}



}




