package java100.app.teach4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BoardController {
	static Scanner keyScan = new Scanner(System.in);
	private ArrayList<Board> list = new ArrayList<>();

	public void execute() {
		loop:
			while (true) {
				System.out.print("게시판> ");
				String input = keyScan.nextLine();

				switch (input) {
				case "list": this.doList(); break;
				case "add": this.doAdd(); break;
				case "view": this.doView(); break;
				case "update": this.doUpdate(); break;
				case "delete": this.doDelete(); break;
				case "main": break loop;
				default: 
					System.out.println("해당 명령이 없습니다.");

				}
			}
	}
	private void doAdd() {
		System.out.println("[게시물 등록]");

		Board board = new Board(); 
		board.input();

		boolean isExist = false;
		Iterator<Board> iterator = list.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().no == board.no) {
				isExist = true;
				break;
			}
		}

		if (isExist) {
			System.out.println("이미 등록된 번호입니다.");
		} else {
			list.add(board);
		}

	} 
	private void doView() {
		System.out.println("[게시물 상세 정보]");
		int no = Integer.parseInt(Prompts.input("번호? "));

		Board board = null;
		Iterator<Board> iterator = list.iterator();
		while (iterator.hasNext()) {
			Board temp = iterator.next();
			if (temp.no == no) {
				board = temp;
				break;
			}
		}
		if(board == null) {
			System.out.printf("%d번 게시물이 없습니다.\n", no);
		}else {
			board.printDetail();
		}
	}

	private void doUpdate() {
		System.out.println("[회원 변경]");
		int no = Integer.parseInt(Prompts.input("번호? "));

		Board board = null;
		Iterator<Board> iterator = list.iterator();
		while (iterator.hasNext()) {
			Board temp = iterator.next();
			if (temp.no == no) {
				board = temp;
				break;
			}
		}
		if(board == null) {
			System.out.printf("%d번 게시물이 없습니다.\n", no);
		} else {
			board.update();
		}
	}
	private void doDelete() {
        System.out.println("[회원 삭제]");
        int no = Integer.parseInt(Prompts.input("번호? "));

		Board board = null;
		Iterator<Board> iterator = list.iterator();
		while (iterator.hasNext()) {
			Board temp = iterator.next();
			if (temp.no == no) {
				board = temp;
				break;
			}
		}
		if (board == null) {
            System.out.printf("%d번 게시물이 없습니다.\n", no);
        } else {
            if (Prompts.confirm2("정말 삭제하시겠습니까?(y/N) ")) {
                list.remove(board);
                System.out.println("삭제하였습니다.");
            } else {
                System.out.println("삭제를 취소하였습니다.");
            }
        }
    }
	private void doList() {
		System.out.println("[게시물 목록]");

		Iterator<Board> iterator = list.iterator();
		while (iterator.hasNext()) {
			iterator.next().print();
		}
	}
	
	
}
