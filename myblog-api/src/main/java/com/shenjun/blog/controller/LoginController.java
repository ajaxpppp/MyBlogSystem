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
@RequestMapping("login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping
    public Result login(@RequestBody LoginParam loginParam) {
        /*登录用户*/
        return loginService.login(loginParam);
    }

}
