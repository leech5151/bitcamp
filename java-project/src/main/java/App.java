// ver 01
// - 표준 출력장치로 인사문구 출력하라
// ver 02 
// - 학생 한 명의 성적 점수를 출력하라
// - 이름, 국어, 영어, 수학, 총점, 평균
//  예)
//  이름 : 홍길동
//  국어 : 100
//  영어 : 100
//  수학 : 100
//  총점 : 300
//  평균 : 100.0
import java.util.Scanner;

public class App {
  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String name; 
        int x,y,z,sum;
        double avg;

        
        System.out.print("이름 : ");
        name = sc.nextLine();
        System.out.print("국어 : ");
        x = sc.nextInt();
        System.out.print("영어 : ");
        y = sc.nextInt();
        System.out.print("수학 : ");
        z = sc.nextInt();
        
        System.out.print("총점 : ");
        sum = x+y+z;
        System.out.println(sum);
        
        System.out.print("평균 : ");
        avg =(double)sum / 3.0 ;
        System.out.println(avg);
    }
}
