package com.xie.aop.proxy.demo2;

import com.xie.aop.proxy.advice.Advice;
import com.xie.aop.proxy.demo1.MyInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * jdk动态代理
 */
public class JdkProxyFactoryBean {

    private Advice advice;

    private Object target;

    public Advice getAdvice() {
        return advice;
    }

    public void setAdvice(Advice advice) {
        this.advice = advice;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new MyInvocationHandler(target, advice));
        return proxy;
    }
}
