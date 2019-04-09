package zoo;

import com.alibaba.fastjson.JSONObject;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zoo.animal.Panda;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class RoomTest {
    private static ApplicationContext context;
    @BeforeClass
    public static void getContext(){
        context = new ClassPathXmlApplicationContext("spring.xml");
    }

    @Test
    public void getBeanWithConstructor(){
        Room room = context.getBean("room", Room.class);
        System.out.println(JSONObject.toJSONString(room));
        Set<Panda> pandaSet = room.getPandaSet();
        Map<String, Panda> pandaMap = room.getPandaMap();
        List<Panda> pandaList = room.getPandaList();
        System.out.println(JSONObject.toJSONString(pandaList));
        // [{"name":"P1","weight":22.2},{"name":"P1","weight":22.2}]
        System.out.println(JSONObject.toJSONString(pandaMap));
        // {"P1":{"name":"P1","weight":22.2},"P2":{"name":"P1","weight":22.2}}
        System.out.println(JSONObject.toJSONString(pandaSet));
        // [{"name":"P1","weight":22.2},null]
    }
}