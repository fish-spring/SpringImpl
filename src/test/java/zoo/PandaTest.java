package zoo;

import com.alibaba.fastjson.JSONObject;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class PandaTest {
    private static ApplicationContext context;
    @BeforeClass
    public static void getContext(){
        context = new ClassPathXmlApplicationContext("spring.xml");
    }

    @Test
    public void getBeanWithConstructor(){
        Panda HuanHuan = (Panda) context.getBean("HuanHuan");
        System.out.println(JSONObject.toJSONString(HuanHuan));
        // {"name":"HuanHuan","weight":22.2}
        Panda Huan = (Panda) context.getBean("HuanThePanda");
        System.out.println(Huan == HuanHuan);  // true
    }

    @Test
    public void getBeanWithProperties(){
        Panda LeLe = (Panda) context.getBean("LeLe");
        System.out.println(JSONObject.toJSONString(LeLe));
        // {"name":"LeLe","weight":33.14}
    }

    @Test
    public void getBeanWithStaticFactory(){
        Panda DaBao = (Panda) context.getBean("DaBao");
        System.out.println(JSONObject.toJSONString(DaBao));
        // {"name":"DaBao","weight":55.5}
    }
}