package com.shitianbao.webproj.common;

public class CommonResult {

    private Integer code;
    private String msg;
    private Integer count;
    private Object data;

    public CommonResult(Object data) {
        this.data = data;
        this.code = 0;
        this.msg = "success";
        this.count = 0;
    }

    public CommonResult() {
        this.code = 0;
        this.msg = "success";
        this.count = 0;
    }

    public CommonResult(Integer count, Object data) {
        this.count = count;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CommonResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }
}
