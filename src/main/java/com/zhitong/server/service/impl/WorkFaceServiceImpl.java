package com.zhitong.server.service.impl;

import com.zhitong.server.entity.WorkFaceEntity;
import com.zhitong.server.mapper.WorkFaceMapper;
import com.zhitong.server.service.WorkFaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//1、service注解，注入容器
@Service
//2、实现WorkFaceService
public class WorkFaceServiceImpl implements WorkFaceService {
    //3、注入mapper
    @Autowired
    private WorkFaceMapper workFaceMapper;

    //4、重写方法
    @Override
    public void save(WorkFaceEntity workFaceEntity) {
        //5、调用mapper的方法
        workFaceMapper.save(workFaceEntity);
    }
}

