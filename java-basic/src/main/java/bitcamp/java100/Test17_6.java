package bitcamp.java100;


public class Test17_6 {
    
    static int[] m1() {
        int[] values = {100, 90, 80};
        int[] values2;
        values2 = new int[] {100, 90, 80};
        
        return new int[] {100, 90, 80};
    }
    
    
    
    public static void main(String[] args) {
        for (int v : m1()) {
            System.out.println(v);
            
            
        }
    }   
}