package com.iljesus.zceblog.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.iljesus.zceblog.entity.Test;
import com.iljesus.zceblog.service.TestService;
import com.iljesus.zceblog.service.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestServiceImpl testService;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Test> getTest(){
        System.out.println(testService.findAll());
        return testService.findAll();
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println(testService.findAll());
        return "世界你好";
    }

}
