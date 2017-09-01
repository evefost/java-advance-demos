package com.xie.aop.proxy;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/9/1.
 */
public class JdkDynamicAopProxy implements AopProxy,InvocationHandler,Serializable {



    public Object getProxy() {
        return Proxy.newProxyInstance(getClass().getClassLoader(),null,this);
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object target = null;
        //do before
        Object retVal = method.invoke(target, args);
        //do after
        return retVal;
    }
}
