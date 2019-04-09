package zoo.annotation;

import com.alibaba.fastjson.JSONObject;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PandaWatcherSetterAnnotationTest {
    private static ApplicationContext context;
    @BeforeClass
    public static void getContext(){
        context = new ClassPathXmlApplicationContext(
                "ioc/annotation/spring.xml");
    }

    @Test
    public void autowire(){
        PandaWatcherSetterAnnotation pandaSetterWatcher =
                context.getBean("pandaWatcherSetter",
                        PandaWatcherSetterAnnotation.class);
        System.out.println(JSONObject.toJSONString(pandaSetterWatcher));
        // {"name":"watcher","panda":{"name":"panda"}}
    }
}