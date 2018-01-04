// Spring IoC(Inversion of Control) 컨테이너 - 셋터 호출
// 
package bitcamp.java100.ch21.ex2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext appCtx = 
                new ClassPathXmlApplicationContext(
                        "bitcamp/java100/ch21/ex2/application-context2.xml");
        
        String[] names = appCtx.getBeanDefinitionNames();
        for (String name : names) {
            System.out.printf("%s => %s\n", 
                    name, appCtx.getBean(name).getClass().getName());
        }
        System.out.println("------------------------------------------");
        
        Front obj = (Front) appCtx.getBean(Front.class);
        obj.test();
    }
}
 
// component-annotation을 처리해줄 객체를 스프링 IoC 컨테이너에 선언해줘야한다.







