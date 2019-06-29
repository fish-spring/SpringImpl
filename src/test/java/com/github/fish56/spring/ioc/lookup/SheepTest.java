package com.github.fish56.spring.ioc.lookup;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class SheepTest {
    private static ApplicationContext context;
    @BeforeClass
    public static void getContext(){
        context = new ClassPathXmlApplicationContext(
                "classpath:ioc/lookup/lookup.xml");
    }

    @Test
    public void callPolice(){
        Sheep sheep = context.getBean(Sheep.class);
        sheep.callPolice();
    }
}