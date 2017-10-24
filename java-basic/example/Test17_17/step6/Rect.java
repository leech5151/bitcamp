package bitcamp.java100.Test17_17.step6;

public class Rect {
    int width ; 
    int height ;
    
    float area(Rect r) {
        return (this.width * this.height) / 10000f;
    }
    
    float pyeong(Rect r) {
        return (this.width * this.height) / 10000f / 3.3f;
    }
    
    void init(Rect r, int w, int h) {
        this.width = w;
        this.height = h;
    }
}
