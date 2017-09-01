package com.xie.aop.factory;

import com.xie.aop.AdvisedSupport;
import com.xie.aop.proxy.AopProxy;
import com.xie.aop.proxy.CglibAopProxy;
import com.xie.aop.proxy.JdkDynamicAopProxy;

import java.lang.reflect.Proxy;

/**
 * 代理工厂
 */
public class AopProxyFactory {


    public AopProxy createProxy(AdvisedSupport config) {
        Class targetClass = config.getTargetClass();
        if (config.isProxyTargetClass()) {

            if (targetClass.isInterface() || Proxy.isProxyClass(targetClass)) {
                JdkDynamicAopProxy proxy = new JdkDynamicAopProxy(config);
                return proxy;
            }
            return new CglibAopProxy(config);
        } else {
            Class[] interfaces = targetClass.getInterfaces();
            if(interfaces != null && interfaces.length>0){
                return new JdkDynamicAopProxy(config);
            }
            return new CglibAopProxy(config);
        }
    }
}
