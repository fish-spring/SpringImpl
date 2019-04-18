package mall.config;

import com.alibaba.fastjson.JSONObject;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class SpringConfigTest {
    private static ApplicationContext context;
    @BeforeClass
    public static void init(){
        context = new AnnotationConfigApplicationContext(
                SpringConfig.class);
    }
    @Test
    public void showBeans(){
        System.out.println(
                JSONObject.toJSONString(
                        context.getBeanDefinitionNames()));
        // [..., "org.springframework.context.event.internalEventListenerFactory",
        // "springConfig","user01"]
    }
    @Test
    public void autoScan(){
        System.out.println(
                JSONObject.toJSONString(
                        context.getBeanDefinitionNames()));
        //[..., "springConfig","userController","userDao","user01"]
    }
}