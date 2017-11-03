package java100.app.Me2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ScoreController {
	private ArrayList<Score> list = new ArrayList<>();
	static Scanner keyScan = new Scanner(System.in);

	public void execute() {
		loop:
			while(true) {
				System.out.print("성적관리> ");
				String input = keyScan.nextLine();

				switch(input) {
				case "add" : doAdd(); break;
				case "list" : doList(); break;
				case "view" : doView(); break;
				case "update" : doUpdate(); break;
				case "delete" : doDelete(); break;
				case "menu": break loop;
				default : System.out.println("해당 명령이 없습니다.");
				} 
			}
	}
	private void doDelete() {
		Iterator<Score> iterator ;
		System.out.println("[학생 삭제]");
		String name = Prompts.input("이름? ");
		Score score = null;
		
		iterator = list.iterator();
		while(iterator.hasNext()) {
			Score temp = iterator.next();
			if(temp.name.equals(name)	) {
				score = temp;
				break;
			}
		}
		if (score == null) {
			System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
		} else {
			if(Prompts.confirm2("정말 삭제하시겠습니까?(y/N) ")) {
				list.remove(score);
				System.out.println("삭제하였습니다.");
			}else {
				System.out.println("삭제를 취소하였습니다.");
			}
		}
	}
	private void doUpdate() {
		Iterator<Score> iterator ;
		System.out.println("[학생 갱신]");
		String name = Prompts.input("이름? ");
		Score score = null;
		
		iterator = list.iterator();
		while(iterator.hasNext()) {
			Score temp = iterator.next();
			if(temp.name.equals(name)	) {
				score = temp;
				break;
			}
		}
		if (score == null) {
			System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
		} else {
			score.update();
		}
	}
	private void doView() {
		Iterator<Score> iterator ;
		System.out.println("[학생 정보]");
		String name = Prompts.input("이름? ");
		Score score = null;
		iterator = list.iterator();
		while(iterator.hasNext()) {
			Score temp = iterator.next();
			if(temp.name.equals(name)	) {
				score = temp;
				break;
			}
		}
		if (score == null) {
			System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
		} else {
			score.printDetail();
		}	
	}
	public void doList() {
		Iterator<Score> iterator ;
		System.out.println("[학생 목록]");

		iterator = list.iterator();
		while(iterator.hasNext()) {
			iterator.next().printDetail();
		}

	}
	public void doAdd() {
		Sysstem.out.println("[학생 등록]");

		while (true) {
			Score score = new Score(); 
			score.input();

			list.add(score);

			if (!Prompts.confirm("계속하시겠습니까?(Y/n) "))
				break;
		}

	}
	
}
