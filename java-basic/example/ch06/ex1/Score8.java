package bitcamp.java100.ch06.ex1;

public class Score8 {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
 
    Score8(String name){
        this.name = name;
        
        kor = 50;
        eng = 50;
        math = 50;

        compute();
    }
        
    void compute() {
        sum = kor + eng + math;
        aver = sum / 3f;
    }
}
