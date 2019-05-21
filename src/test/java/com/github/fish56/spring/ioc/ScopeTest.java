package com.github.fish56.spring.ioc;

import com.alibaba.fastjson.JSONObject;
import com.github.fish56.spring.ioc.animal.Panda;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    private static ApplicationContext context;
    @BeforeClass
    public static void getContext(){
        context = new ClassPathXmlApplicationContext("classpath:ioc/scope.xml");
        System.out.println(
                JSONObject.toJSONString(
                        context.getBeanDefinitionNames()));
    }

    @Test
    public void scope(){
        Panda pandaSingleton1 = (Panda) context.getBean("pandaSingleton");
        Panda pandaSingleton2 = (Panda) context.getBean("pandaSingleton");
        Panda pandaPrototype1 = (Panda) context.getBean("pandaPrototype");
        Panda pandaPrototype2 = (Panda) context.getBean("pandaPrototype");
        System.out.println(pandaSingleton1 == pandaSingleton2);  // true
        System.out.println(pandaPrototype1 == pandaPrototype2);  // false
    }
}