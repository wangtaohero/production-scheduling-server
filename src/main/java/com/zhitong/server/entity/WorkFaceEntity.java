package com.zhitong.server.entity;

import lombok.Data;

import java.sql.Date;

//通过注解自动生成set、get方法
@Data
public class WorkFaceEntity {
    private String id;
    private String mineId;
    private String wfName;
    private String wfCode;
    private String wfTypeId;
    private String wfStatusId;
    private String coalSeamId;
    private String miningAreaId;
    private float wfLength;
    private float wfWidth;
    private float wfThickness;
    private float wfTotalReserves;
    private float wfValidReserves;
    private float wfDesignHeight;
    private float hardness;
    private float proportion;
    private Date stopDate;

}
