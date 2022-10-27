package com.iljesus.zceblog.mapper;

import com.iljesus.zceblog.entity.Zcebloglogin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
* @author zce
* @description 针对表【zcebloglogin(用户登录表，简单的明文登录。
 * 后续升级通过电话验证码注册账号或登录)】的数据库操作Mapper
 *
*
 * @createDate 2022-10-27 22:36:49
* @Entity com.iljesus.zceblog.entity.Zcebloglogin
*/
@Mapper
public interface ZceblogloginMapper extends BaseMapper<Zcebloglogin> {


    /**
     * 注意返回值要么为对象，要么为null
     * 绑定的语句由于表中userId唯一，只有一个返回值。倘若出现多个会出现未知错误
     * @param userId
     * @return Zcebloglogin实体List,如果查询失败返回null
     */
    public Zcebloglogin findUserInfoByUserId(String userId);


}




