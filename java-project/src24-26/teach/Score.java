package java100.app.teach;
import java.util.Iterator;
import java.util.Scanner;

public class Score {  

	protected String name;
	protected int kor;
	protected int eng;
	protected int math;
	protected int sum;
	protected float aver;

	public Score() {}
	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

		this.compute();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
		this.compute();
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
		this.compute();
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
		this.compute();
	}


	public int getSum() {
		return sum;
	}


	public float getAver() {
		return aver;
	}


	private void compute() {
		this.sum = kor + eng + math;
		this.aver = this.sum / 3f;
	}



	public void input() {
		Scanner keyScan = new Scanner(System.in);

		System.out.print("이름? ");
		this.name = keyScan.nextLine();

		System.out.print("국어점수? ");
		this.kor = keyScan.nextInt();

		System.out.print("영어점수? ");
		this.eng = keyScan.nextInt();

		System.out.print("수학점수? ");
		this.math = keyScan.nextInt();

		this.compute();
	}

	public void update() {
		Scanner keyScan = new Scanner(System.in);

		System.out.printf("국어?(%d) ", this.kor);
		int kor = this.kor;
		try {
			kor = Integer.parseInt(keyScan.nextLine());
		} catch(Exception e) {}

		System.out.printf("영어?(%d) ", this.eng);
		int eng = this.eng;
		try {
			eng = Integer.parseInt(keyScan.nextLine());
		} catch(Exception e) {}

		System.out.printf("수학?(%d) ", this.math);
		int math = this.math;
		try {
			math = Integer.parseInt(keyScan.nextLine());
		} catch(Exception e) {}

		if (Prompts.confirm2("변경하시겠습니까?(y/N) ")) {
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			this.compute();
			System.out.println("변경하였습니다.");

		} else {
			System.out.println("변경을 취소하였습니다.");
		}
	}

}