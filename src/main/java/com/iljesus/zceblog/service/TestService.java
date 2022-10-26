package com.iljesus.zceblog.service;

import com.iljesus.zceblog.entity.Test;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author zce
* @description 针对表【test】的数据库操作Service
* @createDate 2022-10-26 22:05:17
*/
public interface TestService extends IService<Test> {

    List<Test> findAll();

    String findCity(int id);
}
