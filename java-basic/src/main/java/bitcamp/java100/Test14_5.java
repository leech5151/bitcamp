//문자열 표현
package bitcamp.java100;
public class Test14_5 {
        public static void main(String[] args) {
            class Score{
                String name;
                int kor;
                int eng;
                int math;
                int sum;
                float aver;
                void compute(){
                     sum = kor + eng + math;
                     aver = sum / 3.0f;

                }
            }
            Score s1 ; 
            s1 = new Score ();

            s1.name = "홍길동";
            s1.kor = 100;
            s1.eng = 95;
            s1.math = 95;
            s1.sum = 95;
            s1.compute();


            System.out.printf("%s %d %d %d %d %f\n",s1.name,s1.eng,s1.kor,s1.math,s1.sum,s1.aver);

        }
            

    
}