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
// ver 03
// 변수를 이용하여 이름,국어,영어,수학,총점,합계를 저장하라!
// ver 04
// 여러명의 성적을 저장하고 다음과 같이 출력하라!
//출력내용:
//```
//홍길동, 100,90,80,270,90.0
//임꺽정, 80,80.80,240,80.0
//유관순, 100,100,100,300,100.0
//```
import java.util.Scanner;

public class App {
  
    public static void main(String[] args) {

        String[] name = {"홍길동","임꺽정","유관순"};
        int[] n1 = {100,80,100};
        int[] n2 = {90,80,100};
        int[] n3 = {80,80,100};
        int sum=0;
        float avg;

        for(int i=0; i<3; i++)
        {
            sum = n1[i]+n2[i]+n3[i];
            avg = sum / 3.0f;
            System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n", name[i],n1[i],n2[i],n3[i],sum,avg);
        }
         
     





        /*
        Scanner sc = new Scanner(System.in);
        String name; 
        int x,y,z,sum;
        float avg;

        
        System.out.print("이름 : ");
        name = sc.nextLine();
        System.out.print("국어 : ");
        x = sc.nextInt();
        System.out.print("영어 : ");
        y = sc.nextInt();
        System.out.print("수학 : ");
        z = sc.nextInt();
        
        sum = x+y+z;
        System.out.printf("총점 : %d\n",sum);
        //sum = x+y+z;
        //System.out.println(sum);
        
        avg = sum / 3.0f ;
        System.out.printf("평균 : %.1f\n",avg);
        //avg =(double)sum / 3.0 ;
        //System.out.println((int)(avg*100)/100.0);
        */
    }
}
