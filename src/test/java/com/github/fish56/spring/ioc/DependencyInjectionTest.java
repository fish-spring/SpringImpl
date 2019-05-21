package com.github.fish56.spring.ioc;

import com.alibaba.fastjson.JSONObject;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionTest {
    private static ApplicationContext context;
    @BeforeClass
    public static void getContext(){
        context = new ClassPathXmlApplicationContext("classpath:ioc/dependency-injection.xml");
    }

    @Test
    public void getBeanWithConstructor(){
        PandaWatcher watcher1 = (PandaWatcher) context.getBean("watcher1");
        System.out.println(JSONObject.toJSONString(watcher1));
    }

    @Test
    public void getBeanWithProperty(){
        PandaWatcher watcher2 = (PandaWatcher) context.getBean("watcher2");
        System.out.println(JSONObject.toJSONString(watcher2));
    }
}