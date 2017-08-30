package com.xie.aop.proxy.advice;

/**
 * Created by xieyang on 17/8/31.
 */
public interface Advice {

    void doBefore();


    void doAfter();


    void doInException();
}
