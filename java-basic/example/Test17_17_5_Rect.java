package bitcamp.java100;

public class Test17_17_5_Rect {
    int width ; 
    int height ;
    
    static float area(Test17_17_5_Rect r) {
        return (r.width * r.height) / 10000f;
    }
    
    static float pyeong(Test17_17_5_Rect r) {
        return (r.width * r.height) / 10000f / 3.3f;
    }
}
