package bitcamp.java100.ch08.ex2;

public class Test2 {
    public static void main(String[] args) {
        
        Car c;
        c = new Car();
        
        c.model = "티코";
        c.capacity = 4;
        c.enginType = 1;
        c.cylinder = 4;
        c.valve = 16;
        
        //Sedan class
        //c.auto = ture;
        
        c = new Truck();
        c.model = "타이탄";
        c.capacity =3;
        c.cylinder =8;
        c.valve = 32;
        
        c = new Sedan(); 
        
        //c = new Vehicle(); err!
                
    }
}
