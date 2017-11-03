package java100.app.Me4;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Notice {
	static Scanner keyScan = new Scanner(System.in);

    protected int number;
    protected String title; 
    protected String content;
    protected String date;
    protected int viewcount;
    
    Notice(){
    	viewcount = 0;
    }
    public void input() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("번호? ");
        this.number = Integer.parseInt(keyScan.nextLine());
        System.out.print("제목? ");
        this.title = keyScan.nextLine();
        System.out.print("내용? ");
        this.content = keyScan.nextLine();
        
        //this.date = keyScan.nextLine();
    }
    public void print() {
        System.out.printf(" %d, %s, %s, %d\n", this.number, this.title, this.date, this.viewcount);
    }
    public void printDetail() {
        System.out.printf("제목 : %s\n", this.title);
        System.out.printf("내용 : %s\n", this.content);
        System.out.printf("등록일 : %s\n", this.date);
        System.out.printf("조회수 : %d\n", this.viewcount);
        
    }
    
    public void update() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.printf("제목?(%s) ", this.title);
        String title = keyScan.nextLine();
        if (title.isEmpty()) {
            title = this.title;
        }
        
        System.out.printf("내용? ", this.content);
        String content = keyScan.nextLine();
        if (content.isEmpty()) {
            content = this.content;
        }
        
        if (Prompts.confirm2("변경하시겠습니까?(y/N) ")) {
            this.title = title;
            this.content = content;
            System.out.println("변경하였습니다.");
            
        } else {
            System.out.println("변경을 취소하였습니다.");
        }
    }    
}
