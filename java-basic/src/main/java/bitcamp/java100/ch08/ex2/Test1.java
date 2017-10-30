package bitcamp.java100.ch08.ex2;

public class Test1 {
    public static void main(String[] args) {
        
        Vehicle v;
        v = new Vehicle();
        v = new Boat();
        v = new Car();
        v = new Truck();
        v = new Sedan();
        
        Boat b;
        b = new Boat();
     // b = new Vehicle(); err!
     // b = new Car(); err!
     // b = new Truck(); err!
     // b = Sedan(); err!
        
        Car c;
        c = new Car();
        c = new Truck();
        c = new Sedan(); 
     // c = new Boat(); err!
     // c = new Vehicle(); err!
        
        Sedan s;
        s = new Sedan();
     // b = new Boat();
     // b = new Vehicle(); err!
     // b = new Car(); err!
     // b = new Truck(); err!
    
        Truck t;
        t = new Truck();
    }
}
