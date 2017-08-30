package com.xie.aop.proxy.demo2;

import com.xie.aop.proxy.target.TargetInterface;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Administrator on 2017/8/29.
 */
public class ProxyTest {

    public static void main(String[] args) throws FileNotFoundException {


        String path = ProxyTest.class.getResource("").getPath();
        String paPath = ProxyTest.class.getPackage().getName().replace(".", "/");
        String substring = path.substring(0, path.length() - paPath.length()-1)+"config.properties";
        FileInputStream ips = new FileInputStream(substring);
        TargetInterface bean = (TargetInterface) new BeanFactory(ips).getBean("xxx");
        //Object bean = new BeanFactory(ips).getBean("");
        bean.method1();
        //System.out.println(bean.getClass().getName());
    }
}