package com.zhitong.server.interrupt;

import com.zhitong.server.interrupt.ResultEnum;
import com.zhitong.server.interrupt.ResultVo;

public class ResultUtils {
    /**
     * 成功时返回的方法（data不为空）
     */
    public static ResultVo success(Object o) {
        return new ResultVo(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage(), o);
    }
    /**
     * 成功时返回的方法（data为空）
     */
    public static ResultVo success() {
        return success(null);
    }
    /**
     * 失败时返回的方法
     */
    public static ResultVo error(Integer code, String message) {
        return new ResultVo(code, message, null);
    }
}
