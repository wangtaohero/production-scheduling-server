package com.zhitong.server.interrupt;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@ControllerAdvice

public class MyResponseAdvice implements ResponseBodyAdvice<Object> {
    @Autowired
    ObjectMapper objectMapper;

    //判断是否要执行beforeBodyWrite方法,true为执行,false不执行. 通过该方法可以选择哪些类或那些方法的response要进行处理, 其他的不进行处理.
    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }

    //对response方法进行具体操作处理
    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        //返回类型是否已经封装
        if (body instanceof ResultVo){
            return body;
        }
        // String特殊处理
        if (body instanceof String) {
            try {
                return objectMapper.writeValueAsString(ResultUtils.success(body));
            } catch (JsonProcessingException e) {
                return ResultUtils.error(500,"失败");
            }
        }
        return ResultUtils.success(body);
    }
}
