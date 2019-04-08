package zoo;

import com.alibaba.fastjson.JSONObject;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class PandaWatcherTest {
    private static ApplicationContext context;
    @BeforeClass
    public static void getContext(){
        context = new ClassPathXmlApplicationContext("spring.xml");
    }

    @Test
    public void getBeanWithConstructor(){
        PandaWatcher Marry = (PandaWatcher) context.getBean("Marry");
        System.out.println(JSONObject.toJSONString(Marry));
    }

    @Test
    public void getBeanWithProperty(){
        PandaWatcher Jack = (PandaWatcher) context.getBean("Jack");
        System.out.println(JSONObject.toJSONString(Jack));
    }
}