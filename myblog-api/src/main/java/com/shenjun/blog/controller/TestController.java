package com.shenjun.blog.controller;

import com.shenjun.blog.dao.pojo.SysUser;
import com.shenjun.blog.utils.UserThreadLocal;
import com.shenjun.blog.vo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping
    public Result test(){
        SysUser sysUser = UserThreadLocal.get();
        System.out.println(sysUser);
        return Result.success(null);
    }
}
