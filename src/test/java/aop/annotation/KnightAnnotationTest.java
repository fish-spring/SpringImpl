package aop.annotation;

import aop.worker.Knight;
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

        // aop-around stop original method continue
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