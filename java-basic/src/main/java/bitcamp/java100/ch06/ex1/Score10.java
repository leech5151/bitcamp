package bitcamp.java100.ch06.ex1;

public class Score10 {
    String name = "이름없음";
    int kor = 10;
    int eng = 10;
    int math;
    int sum;
    float aver;
    
    {
        name = "홍길동";
        kor = 20;
    }
    Score10(){
        name = "임꺽정";
        compute();
    }    
            
    void compute() {
        sum = kor + eng + math;
        aver = sum / 3f;
    }
}
