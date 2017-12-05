//: ## ver 48
//: - Spring IoC 컨테이너를 사용하여 객체 관리(Bean Container) 및 
//:   의존 객체 주입(DI)을 자동화하라!
//: - 학습목표
//:   - Spring IoC 컨테이너의 설정 및 사용방법을 익힌다.
//:   - Spring IoC 컨테이너의 역할을 이해한다.
//:   
package java100.app;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java100.app.util.DataSource;

@Configuration 

//@Component 붙은 클래스가 어느 패키지에 있는지 표시
@ComponentScan("java100.app") 

public class App {


    // Spring IoC 컨테이너 객체
    AnnotationConfigApplicationContext iocContainer;
    
    // 스프링 IoC 컨테이너에게 getDataSource() 메서드를 호출해서
    // 이 메서드가 리턴한 객체를 꼭 컨테이너에 보관해달고 표시!
    @Bean 
    DataSource getDataSource() {
        DataSource ds = new DataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/studydb");
        ds.setUsername("study");
        ds.setPassword("1111");
        return ds;
    }
    
    void init() {
        // 애노테이션을 이용하여 IoC 컨테이너를 설정하는 객체 준비
        // => 파라미터로는 설정 관련 애노테이션이 붙은 클래스를 알려준다.
        iocContainer = new AnnotationConfigApplicationContext(App.class);
        
    }
}















