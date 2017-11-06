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
				System.out.print("ȸ������> ");
				String input = keyScan.nextLine();

				// ��ɾ ó���ϴ� �� �ڵ带 ������ �޼���� �����Ѵ�.
				switch (input) {
				case "add": this.doAdd(); break;
				case "list": this.doList(); break;
				case "view": this.doView(); break;
				case "update": this.doUpdate(); break;
				case "delete": this.doDelete(); break;
				case "main": break loop;
				default: 
					System.out.println("�ش� ����� �����ϴ�.");
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
					System.out.println("�̹� ��ϵ� �̸��� �Դϴ�.");
					break;
				}
			}*/	
	}


	private void doList() {
		System.out.println("[�л� ���]");

		Iterator<Member> iterator = list.iterator();
		while (iterator.hasNext()) {
			iterator.next().print();
		}
	}
	private void doDelete() {
		System.out.println("[�л� ����]");
		String email = Prompts.input("�̸�? ");

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
			System.out.printf("'%s'�� ȸ�� ������ �����ϴ�.\n", email);
		} else {
			if (Prompts.confirm2("���� �����Ͻðڽ��ϱ�?(y/N) ")) {
				list.remove(Member);
				System.out.println("�����Ͽ����ϴ�.");
			} else {
				System.out.println("������ ����Ͽ����ϴ�.");
			}
		}
	}

	private void doUpdate() {
		System.out.println("[ȸ�� ���� ����]");
		String email= Prompts.input("�̸���? ");

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
			System.out.printf("'%s'�� ȸ�� ������ �����ϴ�.\n", email);
		} else {
			//  Member.update();
		}
	}

	private void doView() {
		System.out.println("[ȸ�� ����]");
		String email = Prompts.input("�̸���? ");

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
			System.out.printf("'%s'�� ȸ�� ������ �����ϴ�.\n", email);
		} else {
			Member.print();
		}
	}
}
