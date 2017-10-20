//문자열 표현
package bitcamp.java100;
public class Test14_4 {
        public static void main(String[] args) {
            class Score{
                String name;
                int kor;
                int eng;
                int math;
                int sum;
                float aver;
            }

            Score s1 = new Score();
            s1.name = "홍길동";
            s1.kor = 100;
            s1.eng = 95;
            s1.math = 95;
            s1.sum = 95;
            s1.sum = s1.kor + s1.eng + s1.math;
            s1.aver = s1.sum / 3.0f;

            System.out.printf("%s %d %d %d %d %f\n",s1.name,s1.eng,s1.kor,s1.math,s1.sum,s1.aver);

            Score s2 = s1;
            s1 = new Score();

            s1.name = "임꺽정";
            s1.kor = 100;
            s1.eng = 90;
            s1.math = 90;
            s1.sum = 97;
            s1.sum = s1.kor + s1.eng + s1.math;
            s1.aver = s1.sum / 3.0f;

            System.out.printf("%s %d %d %d %d %f\n",s1.name,s1.eng,s1.kor,s1.math,s1.sum,s1.aver);

            System.out.printf("%s %d %d %d %d %f\n",s2.name,s2.eng,s2.kor,s2.math,s2.sum,s2.aver);

    }
}