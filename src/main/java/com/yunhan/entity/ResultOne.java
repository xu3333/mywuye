package com.yunhan.entity;

import java.util.List;
import java.util.Map;

public class ResultOne <T>{
    private int code;//返回码
    private String msg;//返回信息
    private int count;//返回数
    private T data;//返回数据  属于一个类型

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
