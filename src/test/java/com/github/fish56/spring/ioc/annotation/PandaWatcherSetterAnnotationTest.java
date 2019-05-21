package com.github.fish56.spring.ioc.annotation;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

public class PandaWatcherSetterAnnotationTest extends AnnotationTest{

    @Test
    public void autowire(){
        PandaWatcherSetterAnnotation pandaSetterWatcher =
                context.getBean("pandaWatcherSetter",
                        PandaWatcherSetterAnnotation.class);
        System.out.println(JSONObject.toJSONString(pandaSetterWatcher));
        // {"name":"watcher","panda":{"name":"panda"}}
    }
}