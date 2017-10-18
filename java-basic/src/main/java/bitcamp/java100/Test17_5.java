package bitcamp.java100;


public class Test17_5 {
    
    static String m1() {
        return "hello";
    }
    
    static int m2() {
        return 100;
    }
    
    static boolean m3() {
        return true;
    }
    static void m4(String x) {
        System.out.println(x);
    }
    static int m5() {
        return 100;
        // int a = 100;
        // a++;
    }
    public static void main(String[] args) {
        System.out.println(m1());
        System.out.println(m2());
        System.out.println(m3());
        
        String v = m1();
        System.out.println(v);
        
        m4(m1());
        m4(v);
        
    }   
}