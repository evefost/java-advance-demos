package com.xie.aop.factory;

import com.xie.aop.advice.Advice;
import com.xie.aop.proxy.AopProxy;
import com.xie.aop.proxy.CglibAopProxy;
import com.xie.aop.proxy.JdkDynamicAopProxy;

/**
 * 代理工厂
 */
public class AopProxyFactory implements AopProxy {

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
        if (true) {
            CglibAopProxy proxy = new CglibAopProxy();
            return proxy.getProxy();
        } else {
            JdkDynamicAopProxy proxy = new JdkDynamicAopProxy();
            proxy.getProxy();
        }
        return null;
    }
}
