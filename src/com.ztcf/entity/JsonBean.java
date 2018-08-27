package com.ztcf.entity;

import java.io.Serializable;
public class JsonBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private boolean success;
    private String code;
    private Object result;

    // 构造方法，getter方法 略


    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getCode() {
        return code;
    }

    public Object getResult() {
        return result;
    }

    public JsonBean() {
    }
}

