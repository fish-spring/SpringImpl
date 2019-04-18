package mall.config;

import mall.config.condition.Linux;
import mall.entity.Dog;
import mall.entity.User;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:j.properties")
@ComponentScan(value = "mall")
@Import(LifecycleConfig.class)
public class SpringConfig {
    @Lazy
    @Scope(value = "singleton")
    @Bean
    public User user01(){
        return new User("LS", 99);
    }

    @Conditional({Linux.class})
    @Bean
    public User linus(){
        return new User("linus", 22);
    }

    @Bean
    public Dog dog(){
        return new Dog();
    }
}
