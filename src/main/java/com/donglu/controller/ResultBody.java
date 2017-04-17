package com.donglu.controller;

import java.io.Serializable;

/**
 * Created by panmingzhi on 2017/4/17.
 */
public class ResultBody implements Serializable{

    private String meta;
    private String msg;
    private Object data;

    public static ResultBody success(String msg,Object obj){
        return getBasicResultBody(msg, obj, "success");
    }

    public static ResultBody fail(String msg,Object obj){
        ResultBody resultBody = getBasicResultBody(msg, obj, "fail");
        return resultBody;
    }

    private static ResultBody getBasicResultBody(String msg, Object obj, String meta) {
        ResultBody resultBody = new ResultBody();
        resultBody.setMeta(meta);
        resultBody.setMsg(msg);
        resultBody.setData(obj);
        return resultBody;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
