package com.zhitong.server.entity;

import lombok.Data;

import java.sql.Date;

@Data
public class CoalSeamEntity {
    private String id;
    private String mineId;
    private String csName;
    private String csCode;
    private String minable;
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
