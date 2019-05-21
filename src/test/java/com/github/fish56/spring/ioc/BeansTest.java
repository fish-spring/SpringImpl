package com.github.fish56.spring.ioc;

import com.alibaba.fastjson.JSONObject;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.github.fish56.spring.ioc.animal.Panda;

public class BeansTest {
    private static ApplicationContext context;
    @BeforeClass
    public static void getContext(){
        context = new ClassPathXmlApplicationContext("classpath:ioc/beans.xml");
        System.out.println(JSONObject.toJSONString(
                context.getBeanDefinitionNames()));
    }

    @Test
    public void getBeanWithConstructor(){
        // 这里会发生类型信息丢失，需要手动强制类型转换
        Panda hanHan = (Panda) context.getBean("hanHan");
        System.out.println(JSONObject.toJSONString(hanHan));
        // {"name":"HanHan","weight":22.2}

        Panda hanHanThePanda = (Panda) context.getBean("hanHanThePanda");
        System.out.println(hanHan == hanHanThePanda);
        // true
    }

    @Test
    public void getBeanWithProperties(){
        Panda leLe = (Panda) context.getBean("leLe");
        System.out.println(JSONObject.toJSONString(leLe));
        // {"name":"LeLe","weight":33.14}
    }

    @Test
    public void getBeanWithStaticContext(){
        Panda DaBao = (Panda) context.getBean("daBao");
        System.out.println(JSONObject.toJSONString(DaBao));
        // {"name":"DaBao","weight":55.5}
    }
}