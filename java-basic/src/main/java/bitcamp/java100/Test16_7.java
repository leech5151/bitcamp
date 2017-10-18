package bitcamp.java100;

import java.io.StringReader;

public class Test16_7 {

    public static void main(String[] args) {
        
        String[] names = {"홍길동","임꺽정","유관순","안중근","윤봉길"};
        
        for (String n : names) {
            System.out.println(n);
        }
        
        System.out.println("------------------------------------");
        
        int[] kor = {100, 90, 80, 50, 70, 80};
        
        for(int score : kor) {
            System.out.println(score);
        }

        System.out.println("------------------------------------");
        
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        list.add("홍길동");
        list.add("임꺽정");
        list.add("홍길동");
        list.add("임꺽정");
        list.add("우관순");
        list.add("윤동주");
        list.add("윤봉길");
        
        for (String n : list) {
            System.out.println(n);
        }
        
        System.out.println("------------------------------------");
        
        java.util.HashSet<String> set = new java.util.HashSet<>();
        set.add("홍길동");
        set.add("임꺽정");
        set.add("홍길동");
        set.add("임꺽정");
        set.add("우관순");
        set.add("윤동주");
        set.add("윤봉길");
        
        for (String n : set) {
            System.out.println(n);
        }
        
        System.out.println("------------------------------------");
        
        
    }
}