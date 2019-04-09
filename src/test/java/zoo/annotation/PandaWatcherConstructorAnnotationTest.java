package zoo.annotation;

import com.alibaba.fastjson.JSONObject;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PandaWatcherConstructorAnnotationTest {
    private static ApplicationContext context;
    @BeforeClass
    public static void getContext(){
        context = new ClassPathXmlApplicationContext(
                "ioc/annotation/spring.xml");
    }

    @Test
    public void autowire(){
        PandaWatcherConstructorAnnotation pandaWatcher =
                context.getBean("pandaWatcherConstructor",
                        PandaWatcherConstructorAnnotation.class);
        System.out.println(JSONObject.toJSONString(pandaWatcher));
        // {"name":"watcher","panda":{"name":"panda"}}
    }
}