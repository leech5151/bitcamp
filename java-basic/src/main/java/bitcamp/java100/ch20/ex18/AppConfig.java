package bitcamp.java100.ch20.ex18;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Car getCar() {
        Car c = new Car();
        c.setModel("티코");
        c.setColor("검정");
        c.setCapacity(5);
        
        return c; 
    }
    @Bean("engine")
    public Engine getEngine() {
        Engine e = new Engine();
        e.setName("비트엔진");
        e.setValve(16);
        e.setCc(800);
        
        return e; 
    }
}
