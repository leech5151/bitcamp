package bitcamp.java100;

import java.util.ArrayList;
import java.util.Scanner;

public class Test17_7 {
    
    static ArrayList m1() {
        ArrayList list = new ArrayList();
        list.add("홍길동");
        list.add(20);
        list.add(false);
        list.add(4.12f);
        list.add('M');
        
        return list;
    }
    
    public static void main(String[] args) {
        
        java.util.ArrayList a = m1();
        
        for (Object v : a) {
            System.out.println(v);
        }
    }   
}
