package com.github.fish56.spring.ioc.annotation;

import org.junit.Test;

public class FishAnnotationTest extends AnnotationTest{

    @Test
    public void autowire(){
        Fish fish = context.getBean("fish", Fish.class);
        System.out.println(fish.getContext() == context);
        // true
    }
}