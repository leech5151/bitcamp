package java100.app.Me4.domain;
import java.util.Scanner;

import java100.app.Me4.util.Prompts;

public class Score {  
    
    protected String name;
    protected int[] subjects; 
    protected int sum;
    protected float aver;

    //: ### 생성자
    //: > 다른 패키지에서도 호출할 수 있도록 public으로 공개한다.
    public Score() {
        this.subjects = new int[3];
    }
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getSubjects() {
		return subjects;
	}

	public void setSubjects(int[] subjects) {
		this.subjects = subjects;
	}

	public int getSum() {
		return sum;
	}

	public float getAver() {
		return aver;
	}

	public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.subjects = new int[]{kor, eng, math};
        
        this.compute();
    }
    
    //: > 내부에서만 사용할 메서드이기 때문에 공개하지 않는다.
    private void compute() {
        int sum = 0;
        for (int sub : this.subjects) {
            sum += sub;
        } 
        this.sum = sum;
        this.aver = (float)this.sum / this.subjects.length;
    }
    
    //: > 전체 공개할 메서드는 public으로 선언한다. 
    public void print() {
        System.out.printf("%-4s, %4d, %6.1f\n",  
                this.name, 
                this.sum, 
                this.aver);
    }
    
    public void input() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("이름? ");
        this.name = keyScan.nextLine();
        
        System.out.print("국어점수? ");
        this.subjects[0] = keyScan.nextInt();
        
        System.out.print("영어점수? ");
        this.subjects[1] = keyScan.nextInt();
        
        System.out.print("수학점수? ");
        this.subjects[2] = keyScan.nextInt();
        
        this.compute();
    }
    
    public void update() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.printf("국어?(%d) ", this.subjects[0]);
        int kor = this.subjects[0];
        try {
            kor = Integer.parseInt(keyScan.nextLine());
        } catch(Exception e) {}
        
        System.out.printf("영어?(%d) ", this.subjects[1]);
        int eng = this.subjects[1];
        try {
            eng = Integer.parseInt(keyScan.nextLine());
        } catch(Exception e) {}
        
        System.out.printf("수학?(%d) ", this.subjects[2]);
        int math = this.subjects[2];
        try {
            math = Integer.parseInt(keyScan.nextLine());
        } catch(Exception e) {}
        
        if (Prompts.confirm2("변경하시겠습니까?(y/N) ")) {
            this.subjects[0] = kor;
            this.subjects[1] = eng;
            this.subjects[2] = math;
            this.compute();
            System.out.println("변경하였습니다.");
            
        } else {
            System.out.println("변경을 취소하였습니다.");
        }
    }
    
    public void printDetail() {
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                this.name,
                this.subjects[0],
                this.subjects[1],
                this.subjects[2],
                this.sum, 
                this.aver);
        
    }
}
