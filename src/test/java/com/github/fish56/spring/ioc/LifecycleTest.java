package com.github.fish56.spring.ioc;

import com.alibaba.fastjson.JSONObject;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.github.fish56.spring.ioc.animal.cloned.ClonedSheep;
import com.github.fish56.spring.ioc.animal.cloned.ClonedMonkey;
import com.github.fish56.spring.ioc.animal.cloned.ClonedPanda;

public class LifecycleTest {
    private static ConfigurableApplicationContext context;
    @BeforeClass
    public static void getContext(){
        context = new ClassPathXmlApplicationContext("ioc/lifecycle.xml");
        System.out.println("init---------container");
    }

    @Test
    public void lifecycle(){
        ClonedSheep clonedSheep = context.getBean(
                "clonedSheep", ClonedSheep.class);
        System.out.println(JSONObject.toJSONString(clonedSheep));
    }

    @Test
    public void annotation(){
        ClonedMonkey clonedMonkey = context.getBean("clonedMonkey", ClonedMonkey.class);
        System.out.println(JSONObject.toJSONString(clonedMonkey));
    }

    @Test
    public void implement(){
        ClonedPanda clonedPanda = context.getBean("clonedPanda", ClonedPanda.class);
        System.out.println(JSONObject.toJSONString(clonedPanda));
    }

    @AfterClass
    public static void closeContext(){
        System.out.println("close the container --------------");
        context.close();
    }
}
