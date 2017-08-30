package com.xie.aop.proxy.demo1;

import com.xie.aop.proxy.advice.Advice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by xieyang on 17/8/31.
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    private Advice advice;


    public MyInvocationHandler(Object target,Advice advice){
        this.target = target;
        this.advice = advice;
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        try {
            advice.doBefore();
            method.invoke(target, args);
            advice.doAfter();
        } catch (Exception e) {
            advice.doBefore();
            throw e;
        }
        return null;
    }
}
