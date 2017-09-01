package com.xie.aop.factory;

import com.xie.aop.AdvisedSupport;

/**
 * Created by xieyang on 17/9/2.
 */
public class ProxyFactoryBean extends AdvisedSupport {

    public Object getProxy() {
        AopProxyFactory factory = new AopProxyFactory();
        return factory.createProxy(this).getProxy();
    }
}
