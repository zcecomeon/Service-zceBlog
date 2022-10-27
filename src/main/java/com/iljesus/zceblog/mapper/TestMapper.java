package com.iljesus.zceblog.mapper;

import com.iljesus.zceblog.entity.Test;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
* @author zce
* @description 针对表【test】的数据库操作Mapper
* @createDate 2022-10-26 22:05:17
* @Entity com.iljesus.zceblog.entity.Test
*/
@Mapper
public interface TestMapper extends BaseMapper<Test> {

    @MapKey("id")
    Map<Integer,String> findAll();

    String findCitybyid(int id);
}




