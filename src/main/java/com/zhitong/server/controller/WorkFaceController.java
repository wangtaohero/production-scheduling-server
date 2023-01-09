package com.zhitong.server.controller;

import com.zhitong.server.entity.WorkFaceEntity;
import com.zhitong.server.service.WorkFaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//1、定义@RestController
@RestController("/v1")
//2、定义RequestMapping
@RequestMapping
public class WorkFaceController {
    //3、引入service注解
    @Autowired
    private WorkFaceService workFaceService;

    //4、添加工作面
    @PostMapping("/work-faces")
    public String save(@RequestBody WorkFaceEntity workFaceEntity) {
        //5、调用service方法
        workFaceService.save(workFaceEntity);
        System.out.print(workFaceEntity.getWfName());
        return "success";
    }

    //5、分页查询工作面
    @GetMapping("/work-faces")
    public Object findPage(Integer pageNum, Integer pageSize) {
        return workFaceService.findPage(pageNum, pageSize);
    }

    //6、查询单个工作面
    @GetMapping("/work-faces/{wf_id}")
    public WorkFaceEntity find(Integer wfId) {
        return workFaceService.find(wfId);
    }

    //6、修改单个work-face
    @PutMapping("/work-faces/{wf_id}")
    public String updateWorkFace(@RequestBody WorkFaceEntity workFaceEntity) {
        workFaceService.updateWorkFace(workFaceEntity);
        System.out.print(workFaceEntity.getWfName());
        return "ok1";
    }

    //7、删除work-face
    @DeleteMapping("/work-faces/{wf_id}")
    public void deleteWorkFace(Integer wfId) {

        workFaceService.deleteWorkFace(wfId);
    }

}

