package com.shenjun.blog.controller;

import com.shenjun.blog.common.aop.LogAnnotation;
import com.shenjun.blog.service.LoginService;
import com.shenjun.blog.vo.Result;
import com.shenjun.blog.vo.params.LoginParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("register")
public class RegisterController {

    @Autowired
    private LoginService loginService;

    @PostMapping
    public Result register(@RequestBody LoginParam loginParam) {
        /*sso  单点登录,后期如果把登录注册提出去(独立的服务,可以独立提供接口服务)*/
        return loginService.register(loginParam);
    }
}
