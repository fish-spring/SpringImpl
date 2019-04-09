package zoo;

import com.alibaba.fastjson.JSONObject;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zoo.animal.Monkey;

public class MountainTest {
    private static ApplicationContext context;
    @BeforeClass
    public static void getContext(){
        context = new ClassPathXmlApplicationContext("spring.xml");
    }

    @Test
    public void autowire(){
        Mountain WuZhiShan = context.getBean("WuZhiShan", Mountain.class);
        Monkey monkey = WuZhiShan.getMonkey();
        System.out.println(JSONObject.toJSONString(monkey));
    }
}