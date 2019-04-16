package zoo.java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zoo.animal.Panda;

@Configuration
public class AppConfig {
    @Bean
    public Panda getPanda(){
        Panda panda =  new Panda();
        panda.setName("LeLe");
        return panda;
    }
}
