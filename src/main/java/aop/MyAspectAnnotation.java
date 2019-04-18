package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspectAnnotation {
    @Before(value = "execution(public void aop.worker.Knight.fight())")
    public void logBefore(){
        System.out.println("begin log");
    }

    @AfterReturning(value = "execution(public void aop.worker.Knight.fight())")
    public void logAfter(){
        System.out.println("end log");
    }
    public void logAroundButStop(){
        System.out.println("log around");
    }

    @Around(value = "MyAspectAnnotation.knightFight()")
    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("log around begin");
        joinPoint.proceed();
        System.out.println("log around stop");
    }

    @AfterThrowing(value = "execution(public void aop.worker.Knight.overWall())")
    public void afterThrowing(){
        System.out.println("Just throw an exception");
    }

    @Pointcut(value = "execution(public void aop.worker.Knight.fight())")
    private void knightFight(){}
}
