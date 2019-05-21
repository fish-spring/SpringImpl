package com.github.fish56.spring.ioc.annotation;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

public class PandaWatcherAnnotationTest extends AnnotationTest{

    @Test
    public void autowire(){
        PandaWatcherAnnotation pandaWatcher =
                context.getBean("pandaWatcher",
                        PandaWatcherAnnotation.class);
        System.out.println(JSONObject.toJSONString(pandaWatcher));
        // {"name":"watcher","panda":{"name":"panda"},"panda1":{"$ref":"$.panda"}}
    }

    /**
     * 直接创建对象无法进行依赖注入
     */
    @Test
    public void autowireNew(){
        PandaWatcherAnnotation pandaWatcher =
                new PandaWatcherAnnotation();
        System.out.println(pandaWatcher.getPanda());
        // null
    }
}