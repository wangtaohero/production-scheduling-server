package com.zhitong.server.mapper;

import com.zhitong.server.entity.WorkFaceEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkFaceMapper {
    int save(WorkFaceEntity workFaceEntity);
}
