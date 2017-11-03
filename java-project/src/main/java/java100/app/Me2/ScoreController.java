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
				System.out.print("��������> ");
				String input = keyScan.nextLine();

				switch(input) {
				case "add" : doAdd(); break;
				case "list" : doList(); break;
				case "view" : doView(); break;
				case "update" : doUpdate(); break;
				case "delete" : doDelete(); break;
				case "menu": break loop;
				default : System.out.println("�ش� ����� �����ϴ�.");
				} 
			}
	}
	private void doDelete() {
		Iterator<Score> iterator ;
		System.out.println("[�л� ����]");
		String name = Prompts.input("�̸�? ");
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
			System.out.printf("'%s'�� ���� ������ �����ϴ�.\n", name);
		} else {
			if(Prompts.confirm2("���� �����Ͻðڽ��ϱ�?(y/N) ")) {
				list.remove(score);
				System.out.println("�����Ͽ����ϴ�.");
			}else {
				System.out.println("������ ����Ͽ����ϴ�.");
			}
		}
	}
	private void doUpdate() {
		Iterator<Score> iterator ;
		System.out.println("[�л� ����]");
		String name = Prompts.input("�̸�? ");
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
			System.out.printf("'%s'�� ���� ������ �����ϴ�.\n", name);
		} else {
			score.update();
		}
	}
	private void doView() {
		Iterator<Score> iterator ;
		System.out.println("[�л� ����]");
		String name = Prompts.input("�̸�? ");
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
			System.out.printf("'%s'�� ���� ������ �����ϴ�.\n", name);
		} else {
			score.printDetail();
		}	
	}
	public void doList() {
		Iterator<Score> iterator ;
		System.out.println("[�л� ���]");

		iterator = list.iterator();
		while(iterator.hasNext()) {
			iterator.next().printDetail();
		}

	}
	public void doAdd() {
		Sysstem.out.println("[�л� ���]");

		while (true) {
			Score score = new Score(); 
			score.input();

			list.add(score);

			if (!Prompts.confirm("����Ͻðڽ��ϱ�?(Y/n) "))
				break;
		}

	}
	
}
