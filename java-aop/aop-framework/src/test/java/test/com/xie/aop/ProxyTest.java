package test.com.xie.aop;


import com.xie.aop.factory.BeanFactory;
import test.com.xie.aop.target.Target2;
import test.com.xie.aop.target.TargetImpl;
import test.com.xie.aop.target.TargetInterface;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 3.通过cglib创建动态代理
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
        System.out.println(bean.getClass().getName());
    }
}