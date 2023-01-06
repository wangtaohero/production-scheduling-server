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
}
