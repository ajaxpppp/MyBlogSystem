package com.shenjun.blog.handler;

import com.shenjun.blog.vo.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/*对加了@controller注解的方法进行拦截处理AOP的实现*/
@ControllerAdvice
public class AllExceptionHandler {

    /*进行异常处理,处理Exception.class的异常*/
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result doException(Exception e) {
        e.printStackTrace();
        return Result.fail(-999, "系统异常");
    }
}
