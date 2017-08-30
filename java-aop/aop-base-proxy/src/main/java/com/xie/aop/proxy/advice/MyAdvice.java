package com.xie.aop.proxy.advice;

import com.xie.aop.proxy.advice.Advice;

/**
 * Created by xieyang on 17/8/31.
 */
public class MyAdvice implements Advice {

    public void doBefore() {
        System.out.println("方法执行前执行doBefore");
    }

    public void doAfter() {
        System.out.println("方法执行后执行doAfter");
    }

    public void doInException() {
        System.out.println("方法异常里执行doInException");
    }
}
