package com.xie.aop.proxy.demo1;

import com.xie.aop.proxy.advice.Advice;

import java.lang.reflect.Proxy;

/**
 * Created by xieyang on 17/8/31.
 */
public class ProxyFactory {

    public Object getProxy(Object target, Advice advice){

        MyInvocationHandler invocationHandler = new MyInvocationHandler(target,advice);
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), invocationHandler);
        return proxy;
    }

}
