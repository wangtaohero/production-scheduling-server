package com.zhitong.server.interrupt;

public enum ResultEnum {
    UNKUOW_ERROR(-1, "未知错误"),
    SUCCESS(0, "success"),
    ERROR(1, "error");

    private int code;
    private String message;

    ResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code ;
    }

    public void setCode() {
        this.code = code;
    }
    public String getMessage(){
        return  message;
    }
    public void setMessage(){
        this.message=message;
    }
}
