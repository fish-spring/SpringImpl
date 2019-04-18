package mall.entity;

import com.alibaba.fastjson.JSONObject;
import mall.config.SpringConfig;
import org.junit.AfterClass;
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
    @AfterClass
    public static void destroy(){

    }
    @Test
    public void properties(){
        Dog dog = (Dog) context.getBean("dog");
        System.out.println(JSONObject.toJSONString(dog));
        // {"name":"Jon"}
    }
}