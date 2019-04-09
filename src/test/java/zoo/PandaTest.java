package zoo;

import com.alibaba.fastjson.JSONObject;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PandaTest {
    private static BeanFactory factory;
    @BeforeClass
    public static void getContext(){
        factory = new ClassPathXmlApplicationContext("spring.xml");
    }

    @Test
    public void getBeanWithConstructor(){
        Mountain.Panda HuanHuan = (Mountain.Panda) factory.getBean("HuanHuan");
        System.out.println(JSONObject.toJSONString(HuanHuan));
        // {"name":"HuanHuan","weight":22.2}
        Mountain.Panda Huan = (Mountain.Panda) factory.getBean("HuanThePanda");
        System.out.println(Huan == HuanHuan);  // true
    }

    @Test
    public void getBeanWithProperties(){
        Mountain.Panda LeLe = (Mountain.Panda) factory.getBean("LeLe");
        System.out.println(JSONObject.toJSONString(LeLe));
        // {"name":"LeLe","weight":33.14}
    }

    @Test
    public void getBeanWithStaticFactory(){
        Mountain.Panda DaBao = (Mountain.Panda) factory.getBean("DaBao");
        System.out.println(JSONObject.toJSONString(DaBao));
        // {"name":"DaBao","weight":55.5}
    }

    @Test
    public void scope(){
        Mountain.Panda pandaSingleton1 = (Mountain.Panda) factory.getBean("pandaSingleton");
        Mountain.Panda pandaSingleton2 = (Mountain.Panda) factory.getBean("pandaSingleton");
        Mountain.Panda pandaPrototype1 = (Mountain.Panda) factory.getBean("pandaPrototype");
        Mountain.Panda pandaPrototype2 = (Mountain.Panda) factory.getBean("pandaPrototype");
        System.out.println(pandaSingleton1 == pandaSingleton2);  // true
        System.out.println(pandaPrototype1 == pandaPrototype2);  // false
    }
}