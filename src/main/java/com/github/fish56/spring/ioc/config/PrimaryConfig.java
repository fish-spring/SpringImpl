package com.github.fish56.spring.ioc.config;

import com.github.fish56.spring.ioc.annotation.Sheep;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PrimaryConfig {

    /**
     * Primary注解保证来在其他地方@Autowired的时候
     * 这个bean会被优先使用
     * @return
     */
    @Bean
    @Primary
    public Sheep firstSheep() {
        return new Sheep().setName("Jon");
    }

    @Bean
    public Sheep secondSheep() {
        return new Sheep().setName("Jack");
    }
}
