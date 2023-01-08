package com.zhitong.server.interrupt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVo implements Serializable {
    private Integer code ;
    private String message ;
    private Object data ;
}
