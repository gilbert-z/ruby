package com.qfedu.ruby.controller;

import com.qfedu.ruby.dao.TshareMapper;
import com.qfedu.ruby.pojo.Tshare;
import com.qfedu.ruby.service.UserService;
import com.qfedu.ruby.util.ResultBean;
import com.qfedu.ruby.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Api(value = "用户登录注册模块",tags = "登录，注册")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ApiImplicitParam(name = "email", value = "需要接收验证码的邮箱", required=true,paramType="query")
    @ApiOperation(value = "获取邮箱验证码接口",httpMethod = "GET",notes = "输入邮箱地址")
    @GetMapping("emailcode")
    ResultBean getEmailCode(String email) {

        return email!=null?userService.EmailCode(email): ResultUtil.setERROR("请输入邮箱");
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "email", value = "邮箱", required = true, paramType = "query"),
            @ApiImplicitParam(name = "code", value = "验证码", required = true, paramType = "query"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, paramType = "query")
    })
    @ApiOperation(value = "邮箱地址，验证码，密码来注册账号",httpMethod = "GET",notes = "注册账号")
    @GetMapping("register")
    ResultBean register(@Param("email") String email,@Param("code") String code,@Param("password") String password) {

        if (email==null||email==""||code==null||code==""||password==null||password==""){
            return ResultUtil.setERROR("请输入正确验证码");
        } else {
            return userService.register(email,code,password);
        }
    }
    @ApiImplicitParams({
            @ApiImplicitParam(name = "email", value = "邮箱", required = true, paramType = "query"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, paramType = "query")
    })
    @ApiOperation(value = "邮箱密码登录",httpMethod = "GET",notes = "邮箱地址，密码来登录账号。返回值data中为token")
    @GetMapping("login")
    ResultBean login(@Param("email") String email,@Param("password") String password){
        if (email==null||email==""||password==null||password=="") {
            return ResultUtil.setERROR("请输入正确的账号密码");
        }else {
            return userService.login("gilbertzz@163.com","123");
        }
    }
}
