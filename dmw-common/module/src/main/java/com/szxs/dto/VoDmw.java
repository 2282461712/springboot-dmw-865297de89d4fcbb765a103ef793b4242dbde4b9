package com.szxs.dto;

import java.io.Serializable;

/**
 *vo 表示返回的实体类
 * 此对象是所有返回消息的 包体
 */
public class VoDmw implements Serializable {

    private String success;
    private String errorCode;
    private String msg;
    private Object data;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
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
