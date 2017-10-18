package bitcamp.java100;

public class Test17_17_3 {

    static class Rect {
        int width ; 
        int height ;
        
    }
    static float area(Rect r) {
        return (r.width * r.height) / 10000f;
    }
    
    static float pyeong(Rect r) {
        return (r.width * r.height) / 10000f / 3.3f;
    }
    
    
    public static void main (String[] args) {
        Rect rect = new Rect();
        
        rect.width = 390;
        rect.height = 420;
        
        System.out.println(area(rect));
        
        System.out.println(pyeong(rect));
    }
}   
