package bitcamp.java100;

public class Test17_18 {

    static class My{
        int value;
        
        static void prinntln(My ref) {
            System.out.println(ref.value);
        }
    }
    public static void main (String[] args) {
        My r1 = new My();
        My r2 = new My();
        My r3 = new My();
        
        r1.value = 100;
        r1.value = 200;
        r1.value = 300;
        
        

    }
}   
