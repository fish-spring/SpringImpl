package mall.entity;

import mall.config.SpringConfig;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class UserTest {
    private static ApplicationContext context;
    @BeforeClass
    public static void init(){
        context = new AnnotationConfigApplicationContext(SpringConfig.class);
    }
    @Test
    public void lifecycle(){

    }
}