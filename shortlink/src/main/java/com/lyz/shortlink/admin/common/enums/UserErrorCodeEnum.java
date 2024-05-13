package com.lyz.shortlink.admin.common.enums;

import com.lyz.shortlink.admin.convention.error.IErrorCode;

public enum UserErrorCodeEnum implements IErrorCode {
    USER_NULL("B00200","用户记录不存在"),
    USER_EXIST("B00201","用户记录存在");

    private String code;

    UserErrorCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    private String message;

    @Override
    public String code() {
        return null;
    }

    @Override
    public String message() {
        return null;
    }
}
