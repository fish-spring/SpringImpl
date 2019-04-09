package zoo.cloned;

import com.alibaba.fastjson.JSONObject;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zoo.animal.ClonedSheep;

public class ClonedAnimalTest {
    private static ConfigurableApplicationContext context;
    @BeforeClass
    public static void getContext(){
        context = new ClassPathXmlApplicationContext("ioc/lifecycle.xml");
        System.out.println("init---------container");
    }
    @Test
    public void xml(){
        ClonedSheep clonedSheep = context.getBean("clonedSheep", ClonedSheep.class);
        // a sheep is cloned...
        // Sheep: who am I ?
        System.out.println(JSONObject.toJSONString(clonedSheep));
    }

    @Test
    public void annotation(){
        ClonedMonkey clonedMonkey = context.getBean("clonedMonkey", ClonedMonkey.class);
        System.out.println(JSONObject.toJSONString(clonedMonkey));
    }
    @Test
    public void implement(){
        ClonedPanda clonedPanda = context.getBean("clonedPanda", ClonedPanda.class);
        System.out.println(JSONObject.toJSONString(clonedPanda));
    }

    @AfterClass
    public static void closeContext(){
        System.out.println("close the container --------------");
        context.close();
    }
}
