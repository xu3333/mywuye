package com.yunhan.entity;

import java.util.List;
import java.util.Map;

public class tableResult<T> {
    private int code;
    private String msg;
    private int count;
    private List<Map> data;  //返回数据类型返回值也可为空

    public List<Map> getData() {
        return data;
    }

    public void setData(List<Map> data) {
        this.data = data;
    }

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


}
