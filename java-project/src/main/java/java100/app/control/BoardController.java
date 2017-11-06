package java100.app.control;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import java100.app.domain.Board;
import java100.app.util.Prompts;

public class BoardController extends GenericController<Board>{
	
	
	@Override
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
		board.setNo(Prompts.inputInt("번호 ? "));
		board.setTitle(Prompts.inputString("제목? "));	        
		board.setContent(Prompts.inputString("내용? "));
		board.setRegDate(new Date(System.currentTimeMillis()));

		if (findByNo(board.getNo()) != null) {
			System.out.println("이미 등록된 번호입니다.");
		} else {
			list.add(board);
		}

	} 
	private void doView() {
		System.out.println("[게시물 상세 정보]");
		int no = Prompts.inputInt("번호? ");

		Board board = findByNo(no);

		if(board == null) {
			System.out.printf("%d번 게시물이 없습니다.\n", no);
		}else {
			System.out.printf("제목: %s\n", board.getTitle());
			System.out.printf("내용: %s\n", board.getContent());
			System.out.printf("등록일: %s\n", board.getRegDate());
			board.setViewCount(board.getViewCount()+1);
			System.out.printf("조회수: %d\n", board.getViewCount());
		}
	}

	private void doUpdate() {
		System.out.println("[회원 변경]");
		int no = Prompts.inputInt("번호? ");

		Board board = findByNo(no);

		if(board == null) {
			System.out.printf("%d번 게시물이 없습니다.\n", no);
		} else {

			String title = Prompts.inputString("제목?(%s) ", board.getTitle());
			if (title.isEmpty()) {
				title = board.getTitle();
			}
			String content = Prompts.inputString("내용 ?(%s) ", board.getContent());

			if (Prompts.confirm2("변경하시겠습니까?(y/N) ")) {
				board.setTitle(title);
				board.setContent(content);
				board.setRegDate(new Date(System.currentTimeMillis()));
				System.out.println("변경하였습니다.");

			} else {
				System.out.println("변경을 취소하였습니다.");
			}
		}    
	}

	private void doDelete() {
		System.out.println("[회원 삭제]");
		int no = Prompts.inputInt("번호? ");

		Board board = findByNo(no);

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
	private Board findByNo(int no) {
		Iterator<Board> iterator = list.iterator();
		while (iterator.hasNext()) {
			Board board = iterator.next();
			if (board.getNo()== no) {
				return board;
			}
		}
		return null;
	}


}
