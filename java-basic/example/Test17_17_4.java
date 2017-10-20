package bitcamp.java100;

public class Test17_17_4 {

    
    static float area(Test17_17_4_Rect r) {
        return (r.width * r.height) / 10000f;
    }
    
    static float pyeong(Test17_17_4_Rect r) {
        return (r.width * r.height) / 10000f / 3.3f;
    }
    
    
    public static void main (String[] args) {
        Test17_17_4_Rect rect = new Test17_17_4_Rect();
        
        rect.width = 390;
        rect.height = 420;
        
        System.out.println(area(rect));
        
        System.out.println(pyeong(rect));
    }
}   
