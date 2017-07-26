package com.yy.util;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/2/17.
 *
 */
public class ResultAjax implements Serializable{

    private int status;
    private Object data;
    private String message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
