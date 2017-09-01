package com.xie.aop.advice;

/**
 * Created by xieyang on 17/8/31.
 */
public interface Advice {

    void doBefore();


    void doAfter();


    void doInException();
}
