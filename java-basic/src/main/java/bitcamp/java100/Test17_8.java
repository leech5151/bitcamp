package bitcamp.java100;


public class Test17_8 {

    static class Member {
        String name;
        int age;
        boolean working;
        float score;
        char level;
    }

    static Member m1() {
        Member ref = new Member();
        ref.name = "홍길동";
        ref.age = 20;
        ref.working = false;
        ref.score = 4.12f;
        ref.level = 'M';

        return ref;
    }

    public static void main(String[] args) {
        Member m = m1();

        System.out.println(m.name);
        System.out.println(m.age);
        System.out.println(m.working);
        System.out.println(m.score);
        System.out.println(m.level);
    }
}   
