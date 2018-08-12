package com.ql.server.util;

/**
 * 
 * @author huch
 */
public class JnResponseBody<T> {

    /***
     * code 标准码
     * msg  标准码信息描述
     * data 返回json数据
     * ***/

    private String code;
    private String msg;
    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
