package zoo.annotation;

import com.alibaba.fastjson.JSONObject;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class PandaWatcherAnnotationTest {
    private static ApplicationContext context;
    @BeforeClass
    public static void getContext(){
        context = new ClassPathXmlApplicationContext(
                "ioc/annotation/spring.xml");
    }

    @Test
    public void autowire(){
        PandaWatcherAnnotation pandaWatcher =
                context.getBean("pandaWatcher",
                        PandaWatcherAnnotation.class);
        System.out.println(JSONObject.toJSONString(pandaWatcher));
        // {"name":"watcher","panda":{"name":"panda"}}
    }
    @Test
    public void autowireNew(){
        PandaWatcherAnnotation pandaWatcher =
                new PandaWatcherAnnotation();
        System.out.println(pandaWatcher.getPanda());
    }
}