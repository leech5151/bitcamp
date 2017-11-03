package java100.app.Me3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MemberManager {
	static Scanner keyScan = new Scanner(System.in);
	private ArrayList<Member> list = new ArrayList<>();

	public void execute() {
		loop:
			while (true) {
				System.out.print("회원관리> ");
				String input = keyScan.nextLine();

				// 명령어를 처리하는 각 코드를 별도의 메서드로 추출한다.
				switch (input) {
				case "add": this.doAdd(); break;
				case "list": this.doList(); break;
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
		Member member;

		member = new Member(); 
		member.input(); 
		list.add(member);
		/*String email = member.email;


			Member m = null;
			Iterator<Member> iterator = list.iterator();
			while (iterator.hasNext()) {
				Member temp = iterator.next();
				if (temp.email.equals(email)) {
					m = temp;
					System.out.println("이미 등록된 이메일 입니다.");
					break;
				}
			}*/	
	}


	private void doList() {
		System.out.println("[학생 목록]");

		Iterator<Member> iterator = list.iterator();
		while (iterator.hasNext()) {
			iterator.next().print();
		}
	}
	private void doDelete() {
		System.out.println("[학생 삭제]");
		String email = Prompts.input("이름? ");

		Member Member = null;
		Iterator<Member> iterator = list.iterator();
		while (iterator.hasNext()) {
			Member temp = iterator.next();
			if (temp.email.equals(email)) {
				Member = temp;
				break;
			}
		}

		if (Member == null) {
			System.out.printf("'%s'의 회원 정보가 없습니다.\n", email);
		} else {
			if (Prompts.confirm2("정말 삭제하시겠습니까?(y/N) ")) {
				list.remove(Member);
				System.out.println("삭제하였습니다.");
			} else {
				System.out.println("삭제를 취소하였습니다.");
			}
		}
	}

	private void doUpdate() {
		System.out.println("[회원 정보 변경]");
		String email= Prompts.input("이메일? ");

		Member Member = null;
		Iterator<Member> iterator = list.iterator();
		while (iterator.hasNext()) {
			Member temp = iterator.next();
			if (temp.email.equals(email)) {
				Member = temp;
				break;
			}
		}

		if (Member == null) {
			System.out.printf("'%s'의 회원 정보가 없습니다.\n", email);
		} else {
			//  Member.update();
		}
	}

	private void doView() {
		System.out.println("[회원 정보]");
		String email = Prompts.input("이메일? ");

		Member Member = null;
		Iterator<Member> iterator = list.iterator();
		while (iterator.hasNext()) {
			Member temp = iterator.next();
			if (temp.email.equals(email)) {
				Member = temp;
				break;
			}
		}

		if (Member == null) {
			System.out.printf("'%s'의 회원 정보가 없습니다.\n", email);
		} else {
			Member.print();
		}
	}
}
