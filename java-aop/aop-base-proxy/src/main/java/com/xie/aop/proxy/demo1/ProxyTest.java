package com.xie.aop.proxy.demo1;

import com.xie.aop.proxy.advice.MyAdvice;
import com.xie.aop.proxy.target.TargetImpl;
import com.xie.aop.proxy.target.TargetInterface;

/**
 * Created by xieyang on 17/8/31.
 */
public class ProxyTest {

    public static void main(String[] args) {
        TargetImpl target = new TargetImpl();
        MyAdvice myAdvice = new MyAdvice();
        ProxyFactory factory = new ProxyFactory();
        TargetInterface proxy = (TargetInterface) factory.getProxy(target, myAdvice);
        proxy.method1();
        System.out.println();
        proxy.method2();
        System.out.println();
        //proxy.method2();
        //System.out.println();

    }
}
