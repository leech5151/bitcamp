package bitcamp.java100.ch06.ex1;

public class Score9 {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    {
        System.out.println("인스턴스 초기화 블록 실행11111111!");
    }
    Score9(){
        System.out.println("Score9() 호출됨!");
    }
    Score9(String name){
        System.out.println("Score9(String) 호출됨!");
    }
    {
        System.out.println("인스턴스 초기화 블록 실행22222222!");
    }
            
    void compute() {
        sum = kor + eng + math;
        aver = sum / 3f;
    }
}
