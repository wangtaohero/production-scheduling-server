package com.zhitong.server.entity;

import lombok.Data;

import java.sql.Date;

//通过注解自动生成set、get方法
@Data
public class WorkFaceEntity {
    private int wfId;
    private int mineId;
    private String mine;
    private String wfName;
    private String wfCode;
    private int wfTypeId;
    private String wfType;
    private int wfStatusId;
    private String wfStatus;
    private int coalSeamId;
    private String coalSeam;
    private int miningAreaId;
    private String miningArea;
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
