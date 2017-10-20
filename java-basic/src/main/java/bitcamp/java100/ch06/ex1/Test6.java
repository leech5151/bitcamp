package bitcamp.java100.ch06.ex1;

public class Test6 {
    public static void main(String[] args) {
        Score5 score;
        score = new Score5();
        score = new Score5("임꺽정");
        score = new Score5("홍길동",70,70,90);

        System.out.printf("이름 : %s\n",score.name);
        System.out.printf("총점 : %s\n",score.sum);
        System.out.printf("평균 : %s\n",score.aver);

        // score = new Score3; ------------컴파일오류
        // score = new Score3("홍길동"); --컴파일오류
    }
}
