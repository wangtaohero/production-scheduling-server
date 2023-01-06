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
        return "success";

    }

    //5、分页查询工作面
    @GetMapping("/work-faces")
    public Object findPage(Integer offset, Integer limit) {
        return workFaceService.findPage(offset, limit);
    }

    //6、修改单个work-face
    @PutMapping("/work-face/:id")
    public void update() {

    }

    //7、删除work-face
    @DeleteMapping("/work-face/:id")
    public void delete() {

    }

}

