package zoo.annotation;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FishAnnotationTest {
    private static ApplicationContext context;
    @BeforeClass
    public static void getContext(){
        context = new ClassPathXmlApplicationContext(
                "ioc/annotation/spring.xml");
    }

    @Test
    public void autowire(){
        Fish fish = context.getBean("fish", Fish.class);
        System.out.println(fish.getContext() == context);
        // true
    }
}