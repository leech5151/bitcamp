package bitcamp.java100.ch08.ex1;
class Member3{
    private String name;
    private int age;
    private float weight;
    private float height;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
}
public class Test7_3 {

    public static void main(String[] args) {
        Member3 m = new Member3();
        //        m.name = "홍길동";
        //        m.age = 20;
        //        m.weight = 900.7f;
        //        m.height = 16.0f;

        m.setName("홍길동");
        m.setAge(300);
        m.setWeight(500);
        m.setHeight(-200);
        
        System.out.printf("%s, %d, %.2f, %.2f\n",m.getName(),m.getAge(),m.getWeight(),m.getHeight());
    }
}
