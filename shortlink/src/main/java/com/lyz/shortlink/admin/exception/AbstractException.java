package com.lyz.shortlink.admin.exception;

import com.lyz.shortlink.admin.convention.error.IErrorCode;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.Optional;

@Getter
public class AbstractException extends RuntimeException{

    private IErrorCode errorCode;
    private String errorMessage;

    public AbstractException(String message, Throwable throwable, IErrorCode errorCode) {
        super(message,throwable);
        this.errorCode = errorCode;
        this.errorMessage = Optional.ofNullable(StringUtils.hasLength(message) ? message : null).orElse(errorCode.message());
    }
}
