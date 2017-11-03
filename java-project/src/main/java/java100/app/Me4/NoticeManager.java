package java100.app.Me4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class NoticeManager {
	static Scanner keyScan = new Scanner(System.in);
	private ArrayList<Notice> list = new ArrayList<>();

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
	 private void doList() {
	        System.out.println("[게시판 목록]");
	        
	        Iterator<Notice> iterator = list.iterator();
	        while (iterator.hasNext()) {
	            iterator.next().print();
	        }
	    }
	    
	    private void doAdd() {
	        System.out.println("[게시판 등록]");
	        
	        Notice notice;
	        notice = new Notice(); 
	        notice.input();
	        
	        boolean isExist = false;
	        Iterator<Notice> iterator = list.iterator();
	        while (iterator.hasNext()) {
	            if (iterator.next().number == notice.number) {
	                isExist = true;
	                break;
	            }
	        }
	        if (isExist) {
	            System.out.println("이미 등록된 번호입니다.");
	        } else {
	            list.add(notice);
	        }
	    } 
	    
	    private void doView() {
	        System.out.println("[회원 상세 정보]");
	        int number = Prompts.input2("번호? ");
	        
	        Notice Notice = null;
	        Iterator<Notice> iterator = list.iterator();
	        while (iterator.hasNext()) {
	            Notice temp = iterator.next();
	            if (temp.number == number) {
	                Notice = temp;
	                break;
	            }
	        }
	        
	        if (Notice == null) {
	            System.out.printf("'%d'번 게시물이 없습니다.\n", number);
	        } else {
	        	Notice.viewcount++;
	            Notice.printDetail();
	        }
	    } 
	    
	    private void doUpdate() {
	        System.out.println("[게시판 목록 변경]");
	        int number = Prompts.input2("번호? ");
	        
	        Notice notice = null;
	        Iterator<Notice> iterator = list.iterator();
	        while (iterator.hasNext()) {
	            Notice temp = iterator.next();
	            if (temp.number == number) {
	                notice = temp;
	                break;
	            }
	        }
	        
	        if (notice == null) {
	            System.out.printf("'%d'번 게시물이 없습니다..\n", number);
	        } else {
	            notice.update();
	        }
	    }
	    
	    private void doDelete() {
	        System.out.println("[회원 삭제]");
	        String email = Prompts.input("이메일? ");
	        
	        Notice Notice = null;
	        Iterator<Notice> iterator = list.iterator();
	        while (iterator.hasNext()) {
	            Notice temp = iterator.next();
	            if (temp.email.equals(email)) {
	                Notice = temp;
	                break;
	            }
	        }
	        
	        if (Notice == null) {
	            System.out.printf("'%s'의 회원 정보가 없습니다.\n", email);
	        } else {
	            if (Prompts.confirm2("정말 삭제하시겠습니까?(y/N) ")) {
	                list.remove(Notice);
	                System.out.println("삭제하였습니다.");
	            } else {
	                System.out.println("삭제를 취소하였습니다.");
	            }
	        }
	    }
}
