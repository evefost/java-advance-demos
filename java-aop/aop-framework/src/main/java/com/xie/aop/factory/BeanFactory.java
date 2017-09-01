package com.xie.aop.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Administrator on 2017/8/28.
 */
public class BeanFactory {

    Properties props = new Properties();
    private boolean proxyTargetClass;

    public BeanFactory(InputStream ips) {
        try {
            props.load(ips);
            String proxyType = props.getProperty("proxyTargetClass", "false");
            proxyTargetClass = Boolean.parseBoolean(proxyType);
        } catch (IOException e) {

        }
    }

    public Object getBean(String name) {
        String className = props.getProperty(name);
        Object bean = null;
        try {
            Class clazz = Class.forName(className);
            bean = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (bean instanceof ProxyFactoryBean) {
            Object proxy = null;
            try {
                Object target = Class.forName(props.getProperty(name + ".target")).newInstance();
                ProxyFactoryBean proxyFactoryBean = (ProxyFactoryBean) bean;
                proxyFactoryBean.setProxyTargetClass(proxyTargetClass);
                proxyFactoryBean.setTarget(target);
                return proxyFactoryBean.getProxy();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return proxy;
        }
        return bean;
    }
}
