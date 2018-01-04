// Spring IoC(Inversion of Control) 컨테이너 - 셋터 호출
// 
package bitcamp.java100.ch21.ex5;

public class Test1 {

    public static void main(String[] args) {
        XProxy xproxy = new XProxy();
        Front front = new Front();
        front.x = xproxy;
        
        Front obj = new Front();
        System.out.println(obj);
        System.out.println("------------------------------------------");
        obj.test("홍길동");
        System.out.println("------------------------------------------");
        obj.test(null);
    }
}
 
// component-annotation을 처리해줄 객체를 스프링 IoC 컨테이너에 선언해줘야한다.







