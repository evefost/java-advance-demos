package com.xie.aop.proxy.proxy;

public interface Proxy {

    Object getProxy();

    Object getProxy(ClassLoader classLoader);
}
