package com.xie.aop.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.io.Serializable;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/9/1.
 */
public class CglibAopProxy implements AopProxy, MethodInterceptor,Serializable{


    private Enhancer enhancer = new Enhancer();

    public Object getProxy() {

        return null;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return null;
    }
}
