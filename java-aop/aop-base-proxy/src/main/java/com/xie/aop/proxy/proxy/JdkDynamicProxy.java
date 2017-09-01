package com.xie.aop.proxy.proxy;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/9/1.
 */
public class JdkDynamicProxy implements AopProxy,InvocationHandler,Serializable {


    public Object getProxy() {
        return null;
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return null;
    }
}
