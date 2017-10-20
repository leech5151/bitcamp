//문자열 표현
package bitcamp.java100;
public class Test14_3 {
        public static void main(String[] args) {
            class bit{
                String name;
                boolean gender;
                String ponenumber;
                int birthday;
                int resistdate;
                double grade;
            }            

            bit B;
            B = new bit();

            B.name = "이철희";
            B.gender = true;
            B.ponenumber = "01054599661";
            B.birthday = 930816;
            B.resistdate = 170918;
            B.grade = 3.65;

            System.out.printf(" %s %d %.2f",B.name,B.birthday,B.grade);
            
    }
}