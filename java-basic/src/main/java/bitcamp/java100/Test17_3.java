package bitcamp.java100;


public class Test17_3 {
    
    static void m1(String name) {
        System.out.printf("%s님 반값습니다!\n",name);
    }
    static void m2(String name,int age){
        System.out.printf("%s(%d)님 반갑습니다!\n",name,age);
        
        
        
    }
    
    public static void main(String[] args) {

        m1("홍길동");
        m1("유관순");
        m1("임꺽정");
        m2("이철희",25);
        
    }   
}