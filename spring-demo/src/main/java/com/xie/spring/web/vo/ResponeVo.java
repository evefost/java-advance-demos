package com.xie.spring.web.vo;

/**
 * Created by Administrator on 2017/9/14.
 */
public class ResponeVo<T> {

    private T data;

    private String msg;

    private Integer code;

    private ResponeVo(T data, String msg, Integer code) {
        this.data = data;
        this.msg = msg;
        this.code = code;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public static ResponeVo success() {

        return new ResponeVo(null, "成功", 0);
    }

    public static <T> ResponeVo<T> success(T data) {

        return new ResponeVo(data, "成功", 0);
    }

    public static ResponeVo failure() {
        return new ResponeVo(null, "失败", 1);
    }

}
