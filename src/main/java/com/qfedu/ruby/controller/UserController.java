package com.qfedu.ruby.controller;

import com.qfedu.ruby.dao.TshareMapper;
import com.qfedu.ruby.pojo.Tshare;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Api(value = "用户登录注册模块",tags = "登录，注册")
@RestController
public class UserController {

    @Autowired
    private TshareMapper mapper;

    @ApiOperation(value = "打招呼",httpMethod = "GET",notes = "实现了打招呼功能")
    @GetMapping("hi")
    String sayhi(){
        return "hello";
    }


    @GetMapping("hh")
    void hh(){
        Tshare t = new Tshare();
        t.setContent("asdsadsa");
        mapper.insert(t);
    }
}
