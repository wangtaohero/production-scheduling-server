package com.zhitong.server.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhitong.server.entity.WorkFaceEntity;
import com.zhitong.server.mapper.WorkFaceMapper;
import com.zhitong.server.service.WorkFaceService;
import com.zhitong.server.util.PageResult;
import com.zhitong.server.util.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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

    @Override
    public PageResult findPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<WorkFaceEntity> workFaceEntities = workFaceMapper.selectPage();
        PageInfo<WorkFaceEntity> pageInfo = new PageInfo(workFaceEntities);
        return PageUtils.getPageResult(pageInfo);
    }

    @Override
    public WorkFaceEntity find(Integer wfId){
        return workFaceMapper.find(wfId);

    }
    @Override
    public void updateWorkFace(WorkFaceEntity workFaceEntity){

        workFaceMapper.updateWorkFace(workFaceEntity);
    }
    @Override
    public  void deleteWorkFace(Integer wfId){
        workFaceMapper.deleteWorkFace(wfId);
    }
}

