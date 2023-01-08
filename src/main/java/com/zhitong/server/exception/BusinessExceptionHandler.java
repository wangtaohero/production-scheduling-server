package com.zhitong.server.exception;

import com.zhitong.server.interrupt.ResultEnum;
import com.zhitong.server.interrupt.ResultVo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice

public class BusinessExceptionHandler {
    @ResponseBody
    @ExceptionHandler({BusinessException.class})
    public ResultVo exceptionHandler(BusinessException exception){
        // 省略记录日志
        return new ResultVo(exception.getCode(), exception.getMsg(), null);
    }

    @ResponseBody
    @ExceptionHandler({Exception.class})
    public ResultVo exceptionHandler(Exception exception){
        // 省略记录日志
        return new ResultVo(ResultEnum.UNKUOW_ERROR.getCode(), ResultEnum.UNKUOW_ERROR.getMessage(), exception.getMessage());
    }
}
