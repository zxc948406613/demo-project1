package net.xdclass.demoproject.utils;

import java.io.Serializable;

public class JsonData implements Serializable {
    private int code;

    private String msg;

    private Object data;

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public JsonData() {
    }

    public JsonData(int code) {
        this.code = code;
    }

    public JsonData(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public JsonData(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public JsonData(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 构造成功
     * @param data 成功返回数据
     * @return
     */
    public static JsonData buildSuccess(Object data) {
        return new JsonData(0, "", data);
    }

    /**
     * 构造失败
     * @param errMsg 错误信息
     * @return
     */
    public static JsonData bulldError(String errMsg) {
        return new JsonData(-1, errMsg, null);
    }

}
