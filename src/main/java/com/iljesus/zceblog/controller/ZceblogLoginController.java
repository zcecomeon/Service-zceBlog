package com.iljesus.zceblog.controller;


import com.iljesus.zceblog.service.impl.ZceblogloginServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ZceblogLoginController {

    @Autowired
    private ZceblogloginServiceImpl zceblogloginServiceImpl;
    @RequestMapping("/login")
    @ResponseBody
    public String ZceBlogLogin(@RequestParam(value = "userId")String userId,
                               @RequestParam(value = "password") String password){
        if (zceblogloginServiceImpl.checkUserIdPsw(userId,password)==false){
            return "failure";
        }else {
            return "sucess";
        }
    }

}
