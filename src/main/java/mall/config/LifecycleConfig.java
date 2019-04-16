package mall.config;

import mall.entity.Bear;
import mall.entity.Monkey;
import mall.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifecycleConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public User userSub(){
        return new User("Jan", 22);
    }
    @Bean
    public Monkey monkey(){
        return new Monkey("Sun", 22);
    }
    @Bean
    public Bear bear(){
        return new Bear("Jan", 33);
    }
}
