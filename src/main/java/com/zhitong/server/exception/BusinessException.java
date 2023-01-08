package com.zhitong.server.exception;

import com.zhitong.server.interrupt.ResultEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class BusinessException extends RuntimeException{
    private int code;

    private String msg;

    public BusinessException(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMessage();
    }
}
