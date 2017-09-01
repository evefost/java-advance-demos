package com.xie.aop.proxy;

import com.xie.aop.AdvisedSupport;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.io.Serializable;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/9/1.
 */
public class CglibAopProxy implements AopProxy, MethodInterceptor, Serializable {


    private final AdvisedSupport advised;

    private Enhancer enhancer = new Enhancer();


    public CglibAopProxy(AdvisedSupport config) {
        this.advised = config;
    }

    public Object getProxy() {
        enhancer.setSuperclass(advised.getTargetClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        advised.doBefore();
        Object retVal = methodProxy.invokeSuper(obj, args);
        advised.doAfter();
        return retVal;
    }
}
