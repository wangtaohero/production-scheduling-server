package com.zhitong.server.mapper;
import com.zhitong.server.entity.WorkFaceEntity;
import org.apache.ibatis.annotations.Mapper;



//使用mapper，注入容器

@Mapper

public interface WorkFaceMapper {
    //保存方法
    int save(WorkFaceEntity workFaceEntity);
}
