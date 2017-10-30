package bitcamp.java100.ch07.ex4;

public class Test1/* extends Object*/{
    
    public static void main(String[] args) {
        Test1 obj = new Test1();
        
        if(obj instanceof Test1)
            System.out.println("obj는 Test1의 인스턴스이다.");
        
        if(obj instanceof Object)
            System.out.println("obj는 Object의 인스턴스이다.");
    
        Class c = Test1.class;
        
        c.getSuperclass();
        Class sc = c.getSuperclass();
        System.out.println(sc.getName());
        
        Class sc2 = sc.getSuperclass();
        System.out.println(sc.getName());
        
    
        
    
    }
}
