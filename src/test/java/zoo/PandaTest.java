package zoo;

import com.alibaba.fastjson.JSONObject;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zoo.animal.Panda;

public class PandaTest {
    private static BeanFactory factory;
    @BeforeClass
    public static void getContext(){
        factory = new ClassPathXmlApplicationContext("spring.xml");
    }

    @Test
    public void getBeanWithConstructor(){
        Panda HuanHuan = (Panda) factory.getBean("HuanHuan");
        System.out.println(JSONObject.toJSONString(HuanHuan));
        // {"name":"HuanHuan","weight":22.2}
        Panda Huan = (Panda) factory.getBean("HuanThePanda");
        System.out.println(Huan == HuanHuan);  // true
    }

    @Test
    public void getBeanWithProperties(){
        Panda LeLe = (Panda) factory.getBean("Le -Le");
        System.out.println(JSONObject.toJSONString(LeLe));
        // {"name":"LeLe","weight":33.14}
    }

    @Test
    public void getBeanWithStaticFactory(){
        Panda DaBao = (Panda) factory.getBean("DaBao");
        System.out.println(JSONObject.toJSONString(DaBao));
        // {"name":"DaBao","weight":55.5}
    }

    @Test
    public void scope(){
        Panda pandaSingleton1 = (Panda) factory.getBean("pandaSingleton");
        Panda pandaSingleton2 = (Panda) factory.getBean("pandaSingleton");
        Panda pandaPrototype1 = (Panda) factory.getBean("pandaPrototype");
        Panda pandaPrototype2 = (Panda) factory.getBean("pandaPrototype");
        System.out.println(pandaSingleton1 == pandaSingleton2);  // true
        System.out.println(pandaPrototype1 == pandaPrototype2);  // false
    }
}