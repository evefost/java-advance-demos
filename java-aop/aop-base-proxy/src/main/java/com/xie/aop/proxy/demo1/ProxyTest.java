package com.xie.aop.proxy.demo1;

import com.xie.aop.proxy.advice.MyAdvice;
import com.xie.aop.proxy.target.TargetImpl;
import com.xie.aop.proxy.target.TargetInterface;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 1.普通动态代理
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
        generProxyClass();

    }

    private static void generProxyClass(){
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{TargetInterface.class});
        try {
            FileOutputStream fos = new FileOutputStream("$Proxy0.class");
            fos.write(bytes);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
