package com.szhw.webproj.common;

/**
 * 返回JSON格式的数据
 *
 * @author HJF
 * @date 2018/11/16 19:16
 */
public class RESTResult {
    private Integer code = 0;
    private String message = "success";
    private Object data;

    public RESTResult() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
