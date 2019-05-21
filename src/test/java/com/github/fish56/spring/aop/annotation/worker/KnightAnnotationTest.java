package com.github.fish56.spring.aop.annotation.worker;

import com.github.fish56.spring.aop.annotation.BaseAnnotationTest;
import com.github.fish56.spring.aop.worker.Knight;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class KnightAnnotationTest extends BaseAnnotationTest {
    @Autowired
    private Knight knight;

    @Test
    public void before(){
        knight.fight();
        // begin log
        // Jon is fighting
        // end log
    }
    @Test
    public void aroundAndStop(){
        knight.sleep();
        // log around

        // com.github.fish56.spring.aop-around stop original method continue
    }
    @Test
    public void around(){
        knight.sleepAllNight();
        // log around begin
        // Jon is sleeping
        // log around stop
    }
    @Test(expected = Exception.class)
    public void afterThrowing() throws Exception{
        knight.overWall();
        // Just throw an exception
    }
}