package com.shenjun.blog.controller;

import com.shenjun.blog.common.aop.LogAnnotation;
import com.shenjun.blog.service.SysUserService;
import com.shenjun.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UsersController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("currentUser")
    public Result currentUser(@RequestHeader("Authorization") String token) {
        return sysUserService.findUserByToken(token);
    }
}
