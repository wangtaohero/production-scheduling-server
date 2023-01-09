package com.zhitong.server.service;

import com.zhitong.server.entity.WorkFaceEntity;
import com.zhitong.server.mapper.WorkFaceMapper;
import com.zhitong.server.util.PageResult;

import java.util.List;


public interface WorkFaceService {
    //抽象方法
    void save(WorkFaceEntity workFaceEntity);

    PageResult findPage(Integer pageNum,Integer pageSize);

    WorkFaceEntity find(Integer wfId);

    void updateWorkFace(WorkFaceEntity workFaceEntity);

    void deleteWorkFace(Integer wfId);
}
