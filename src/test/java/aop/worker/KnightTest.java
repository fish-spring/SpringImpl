package aop.worker;

import aop.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class KnightTest extends BaseTest {
    @Autowired
    private Knight knight;

    @Test
    public void normal() {
        Knight knight = new Knight("Jon Snow");
        knight.fight();
        // Jon Snow is fighting
    }

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