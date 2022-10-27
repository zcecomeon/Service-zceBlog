package com.iljesus.zceblog.service;

import com.iljesus.zceblog.entity.Zcebloglogin;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author zce
* @description 针对表【zcebloglogin(用户登录表，简单的明文登录。后续升级通过电话验证码注册账号或登录)】的数据库操作Service
* @createDate 2022-10-27 22:36:49
*/

/**
 * 方法用于
 */
public interface ZceblogloginService extends IService<Zcebloglogin> {


    boolean checkUserIdPsw(String userId,String password);


}
