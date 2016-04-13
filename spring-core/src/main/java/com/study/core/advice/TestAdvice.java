package com.study.core.advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by yong.luo on 2016/1/26.
 */
public class TestAdvice {

    public Object aroundInvoke(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("test advice begin");
        Object object =  joinPoint.proceed();
        System.out.println(object);
        System.out.println("test advice end");
        return object;
    }

    public void beforeInvoke(){
        System.out.println("before invoke");
    }
}
