package com.hrb.gamersky.enums;

/**
 * @author wanghaoji
 * @date 2021/04/18
 */
public enum ResultEnum {

    SUCCESS(200, "操作成功"),
    ERROR(500, "操作失败"),
    ERROR_DATABASE(600, "数据库响应错误");

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return this.code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}
