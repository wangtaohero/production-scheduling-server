package com.zhitong.server.mapper;

import com.zhitong.server.entity.WorkFaceEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


//1、使用mapper，注入容器

@Mapper

public interface WorkFaceMapper {
    //2、保存方法
    int save(WorkFaceEntity workFaceEntity);

    //3、分页查询方法
    List<WorkFaceEntity> selectPage();

    //4、查询单个工作面
    WorkFaceEntity find(Integer wfId);

    //5、修改工作面信息
    void updateWorkFace(WorkFaceEntity workFaceEntity);

    //6、删除工作面
    void deleteWorkFace(Integer wfId);
}
