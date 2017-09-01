package com.xie.aop.proxy;

import com.xie.aop.AdvisedSupport;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/9/1.
 */
public class JdkDynamicAopProxy implements AopProxy, InvocationHandler, Serializable {

    private final AdvisedSupport advised;

    public JdkDynamicAopProxy(AdvisedSupport config) {
        this.advised = config;
    }

    public Object getProxy() {
        Class[] interfaces = advised.getTargetClass().getInterfaces();
        return Proxy.newProxyInstance(getClass().getClassLoader(), interfaces, this);
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object target = advised.getTarget();
        advised.doBefore();
        Object retVal = method.invoke(target, args);
        advised.doAfter();
        return retVal;
    }
}
