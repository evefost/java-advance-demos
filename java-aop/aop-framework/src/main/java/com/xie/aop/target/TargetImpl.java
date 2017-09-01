package com.xie.aop.target;

/**
 * Created by xieyang on 17/8/31.
 */
public class TargetImpl implements TargetInterface {

    public String method1() {
        System.out.println("执行目标方法1");
        return "方法1的返回值";
    }

    public void method2() {
        System.out.println("执行目标方法2");
    }
}
