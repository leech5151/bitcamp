package java100.app.teach2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ScoreController {
    
    static Scanner keyScan = new Scanner(System.in);
    
    // ArrayList ��ü�� �޼������ ����ƽ���� �� ������,
    // �ƴϸ� �ν��Ͻ��� ������ ������ �����ؾ� �Ѵ�.
    // => ���� ���α׷����� ���� ����� ���ÿ� �ٷ� ���� ���ٸ�
    //    �׳� ����ƽ ����� �д�.
    // => ���α׷����� ���� ����� ���� �� ������ ���� �ִٸ�
    //    �ν��Ͻ� ����� �����ؾ� �Ѵ�.
    //    �� ���������� �ٷ� �����Ͷ�� �ν��Ͻ� ����� �����!
    // => �ǹ�!
    //    �ǹ������� ���߿� ���� �� ����� ���� ����� 
    //    ���� �ν��Ͻ� ����� �����Ѵ�.
    //    ����, Prompts Ŭ������ �޼���ó�� �ν��Ͻ� ������ 
    //    ����� ���� Ȯ���� ���� ��쿡�� ����ƽ���� �����Ѵ�.
    // 
    
    // ���� �����͸� �����ϴ� ��� ��ü�� �ܺ� ������ ���´�.
    private ArrayList<Score> list = new ArrayList<>();
    
    public void execute() {
        loop:
        while (true) {
            System.out.print("��������> ");
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
    
    // �������� App Ŭ�������� doXxx() �޼��带 ȣ���ϱ� ������
    // �����Ͽ���.
    // ������ App Ŭ�������� ���� doXxx()�� ȣ���ϴ� �� �ƴ϶�,
    // ���� ����� execute()���� ȣ���ϱ� ������ ������ �ʿ䰡 ����.
    // => ��ü���� ���α׷��ֿ����� ������ ���� ������ ���̴� ����
    //    ���������� ����.
    //    �� ������ �ʿ䰡 ���� ���� �����϶�!
    // 
    private void doDelete() {
        System.out.println("[�л� ����]");
        String name = Prompts.input("�̸�? ");
        
        Score score = null;
        Iterator<Score> iterator = list.iterator();
        while (iterator.hasNext()) {
            Score temp = iterator.next();
            if (temp.name.equals(name)) {
                score = temp;
                break;
            }
        }
        
        if (score == null) {
            System.out.printf("'%s'�� ���� ������ �����ϴ�.\n", name);
        } else {
            if (Prompts.confirm2("���� �����Ͻðڽ��ϱ�?(y/N) ")) {
                list.remove(score);
                System.out.println("�����Ͽ����ϴ�.");
            } else {
                System.out.println("������ ����Ͽ����ϴ�.");
            }
        }
    }

    private void doUpdate() {
        System.out.println("[�л� ���� ����]");
        String name = Prompts.input("�̸�? ");
        
        Score score = null;
        Iterator<Score> iterator = list.iterator();
        while (iterator.hasNext()) {
            Score temp = iterator.next();
            if (temp.name.equals(name)) {
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
        System.out.println("[�л� ����]");
        String name = Prompts.input("�̸�? ");
        
        Score score = null;
        Iterator<Score> iterator = list.iterator();
        while (iterator.hasNext()) {
            Score temp = iterator.next();
            if (temp.name.equals(name)) {
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

    private void doList() {
        System.out.println("[�л� ���]");
        
        Iterator<Score> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().print();
        }
    }

    private void doAdd() {
        System.out.println("[�л� ���]");
        
        Score score;
        while (true) {
            score = new Score(); // ���� �����͸� ������ �� ��ü�� �غ��Ѵ�.
            score.input(); // ����ڷκ��� �Է¹��� �����͸� �� ��ü�� �����Ѵ�.
            
            list.add(score);
            
            if (!Prompts.confirm("����Ͻðڽ��ϱ�?(Y/n) "))
                break;
        }
        
    }
}
