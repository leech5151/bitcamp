package bitcamp.java100.ch06.ex4;

public class Test6 {
    
    public static void main(String[] args) {
      
        
        Calculator2 c1 = new Calculator2();
        Calculator2 c2 = new Calculator2();
        
        Calculator2.plus(c1,2);
        Calculator2.plus(c1,5);
        Calculator2.multiple(c1,3);
        Calculator2.minus(c1,7);
        Calculator2.devide(c1,2);
        System.out.println(c1.result);
        
        Calculator2.plus(c2,3);
        Calculator2.multiple(c2,6);
        Calculator2.minus(c2,25);
        Calculator2.plus(c2,11);
        Calculator2.devide(c2,2);
       
        System.out.print(c2.result);
    }
}
