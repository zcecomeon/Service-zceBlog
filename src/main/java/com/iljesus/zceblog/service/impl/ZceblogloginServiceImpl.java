package com.iljesus.zceblog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.iljesus.zceblog.entity.Zcebloglogin;
import com.iljesus.zceblog.service.ZceblogloginService;
import com.iljesus.zceblog.mapper.ZceblogloginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author zce
* @description 针对表【zcebloglogin(用户登录表，简单的明文登录。后续升级通过电话验证码注册账号或登录)】的数据库操作Service实现
* @createDate 2022-10-27 22:36:49
 * @Mapper注解可以动态的生成bean
*/
@Service
public class ZceblogloginServiceImpl extends
        ServiceImpl<ZceblogloginMapper, Zcebloglogin> implements ZceblogloginService{

    @Autowired
    private ZceblogloginMapper zceblogloginMapper;

    /**
     *
     * @param userId
     * @param password
     * @return 检查账号密码是否正确，正确返回true，错误返回false
     */
    @Override
    public boolean checkUserIdPsw(String userId, String password) {

        Zcebloglogin zcebloglogin=zceblogloginMapper.findUserInfoByUserId(userId);
        if(zcebloglogin==null){
            return false;
        }else {
            if (zcebloglogin.getPassword()==password){
                return true;
            }else {
                return false;
            }
        }
    }
}




