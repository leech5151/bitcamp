package bitcamp.java100.ch08.ex1;

class Score5 {
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int sum;
    private float average;
    
    public void setName(String name) {
        this.name = name;
    } 
    public String getName() {
        return name;
    }
    public void setKor(int kor) {
        this.kor = kor;
        this.compute();
    }
    public int getKor() {
        return kor;
    }
    public void setEng(int eng) {
        this.eng = eng;
        this.compute();
    }
    public int getEng() {
        return eng;
    }
    public void setMath(int math) {
        this.math = math;
        this.compute();
    }
    public int getMath() {
        return math;
    }
    private void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.average = this.sum / 3f;
    }
    public int getSum() {
        return sum;
    }
    public float getAverage() {
        return average;
    }
}

public class Test8_5 {
    public static void main(String[] args) {
        Score5 s = new Score5();
        s.setName("홍길동"); 
        s.setKor(100);
        s.setEng(90);
        s.setMath(80);

        System.out.printf("%s, %d, %d, %d, %d, %.2f\n",
                s.getName(), s.getKor(), s.getEng(), s.getMath(), s.getSum(), s.getAverage());

        

    }
}
