package com.qfedu.ruby.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Api(value = "用户登录注册模块",tags = "登录，注册")
@RestController
public class UserController {

    @ApiOperation(value = "打招呼",httpMethod = "GET",notes = "实现了打招呼功能")
    @GetMapping("hi")
    String sayhi(){
        return "hello";
    }
}
