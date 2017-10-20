package bitcamp.java100;


public class Test16_1 {

    public static void main(String[] args) {
        int a = 100; 
        
        {
            System.out.println(a);
            
            // int a = 200; error
            int b = 200;
            {
                System.out.println(b);
                int c = 300;
                System.out.println(c);
            }
            // System.out.println(c); error
        }
        
        System.out.println(a);
        
        // System.out.println(b); error
    }
}
