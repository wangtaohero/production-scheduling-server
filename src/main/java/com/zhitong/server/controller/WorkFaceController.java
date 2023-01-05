package com.zhitong.server.controller;

import com.zhitong.server.entity.WorkFaceEntity;
import com.zhitong.server.service.WorkFaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//1、定义@RestController
@RestController
//2、定义RequestMapping
@RequestMapping("/work-face")
public class WorkFaceController {
    //3、引入service注解
    @Autowired
    private WorkFaceService workFaceService;

    //4、编写方法
    @PostMapping("/save")
    public String save(@RequestBody WorkFaceEntity workFaceEntity) {
        //5、调用service方法

        workFaceService.save(workFaceEntity);
        System.out.print(workFaceEntity.getWfName());
        return "success";
    }
}
