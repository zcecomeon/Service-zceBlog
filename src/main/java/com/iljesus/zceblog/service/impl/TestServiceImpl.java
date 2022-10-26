package com.iljesus.zceblog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.iljesus.zceblog.entity.Test;
import com.iljesus.zceblog.service.TestService;
import com.iljesus.zceblog.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author zce
* @description 针对表【test】的数据库操作Service实现
* @createDate 2022-10-26 22:05:17
*/
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements TestService{

    @Autowired //该注解的作用
    private TestMapper testMapper;
    @Override
    public List<Test> findAll() {
        return testMapper.findAll();
    }

    @Override
    public String findCity(int id) {
        return testMapper.findCitybyid(id);
    }
}




