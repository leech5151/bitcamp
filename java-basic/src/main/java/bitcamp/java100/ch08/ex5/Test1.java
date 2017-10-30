// 다형성 - 오버라이딩 사용 전
package bitcamp.java100.ch08.ex5;

public class Test1 {
    public static void main(String[] args) {
        ScoreEx s1 = new ScoreEx(1, "홍길동", 100, 100, 100, 80, 80);

        System.out.printf("합계 = %d\n",s1.getSum());
        System.out.printf("평균 = %f\n",s1.getAver());
        
        s1.setKor(80);
        System.out.printf("합계 = %d\n",s1.getSum());
        System.out.printf("평균 = %f\n",s1.getAver());
    }
    
    
    
}
