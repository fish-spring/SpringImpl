package com.github.fish56.spring.ioc.annotation;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

public class PandaWatcherConstructorAnnotationTest extends AnnotationTest{

    @Test
    public void autowire(){
        PandaWatcherConstructorAnnotation pandaWatcher =
                context.getBean("pandaWatcherConstructor",
                        PandaWatcherConstructorAnnotation.class);
        System.out.println(JSONObject.toJSONString(pandaWatcher));
        // {"name":"watcher","panda":{"name":"panda"}}
    }
}