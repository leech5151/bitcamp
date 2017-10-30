import java.util.Scanner;

public class Score {
    Scanner keyScan = new Scanner(System.in);
    protected String name;
    protected int subnum;
    protected int[] subjects;
    protected int sum;
    protected float aver;
    
    Score() {
        System.out.print("이름 ? ");
        this.name = keyScan.nextLine();
        
        System.out.print("몇개 과목 ? ");
        this.subnum = keyScan.nextInt();
        this.subjects = new int[this.subnum];
        
        for(int i = 0; i < this.subnum; i++) {
            System.out.printf("%d번째 과목 점수 ? ",i+1);
            this.subjects[i] = keyScan.nextInt();
        }
        this.compute();
    }
    
    void compute() {
        for (int sub : this.subjects) {
            this.sum += sub;
        }
        this.aver = (float)this.sum / this.subjects.length;
    }
    void print() {
        System.out.printf("%-4s",this.name);
        for(int j= 0; j < subjects.length; j++) {
            System.out.printf("%4d",this.subjects[j]);
        }
        System.out.printf("\n 총점 : %d 평균 : %.1f\n",this.sum, this.aver);
    }
}
