package com.qfedu.ruby.controller;

import com.qfedu.ruby.pojo.Tuser;
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
    @GetMapping("user/emailcode.do")
    ResultBean getEmailCode(String email) {

        return email!=null?userService.EmailCode(email): ResultUtil.setERROR("请输入邮箱");
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "email", value = "邮箱", required = true, paramType = "query"),
            @ApiImplicitParam(name = "code", value = "验证码", required = true, paramType = "query"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, paramType = "query")
    })
    @ApiOperation(value = "邮箱地址，验证码，密码来注册账号",httpMethod = "GET",notes = "注册账号")
    @GetMapping("user/register.do")
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
    @GetMapping("user/login.do")
    ResultBean login(@Param("email") String email,@Param("password") String password){
        if (email==null||email==""||password==null||password=="") {
            return ResultUtil.setERROR("请输入正确的账号密码");
        }else {
            return userService.login(email,password);
        }
    }


    @ApiImplicitParams({
            @ApiImplicitParam(name = "email", value = "邮箱", required = true, paramType = "query"),
            @ApiImplicitParam(name = "code", value = "验证码", required = true, paramType = "query"),
    })
    @ApiOperation(value = "用验证码登录",httpMethod = "GET",notes = "邮箱地址，验证码登录账号")
    @GetMapping("user/loginbycode.do")
    ResultBean loginByCode(@Param("email") String email,@Param("code") String code) {

        if (email==null||email==""||code==null||code==""){
            return ResultUtil.setERROR("请输入正确验证码");
        } else {
            return userService.loginByCode(email,code);
        }
    }
    @ApiOperation(value = "退出登录",httpMethod = "GET",notes = "传入token来退出登录")
    @GetMapping("user/loginout.do")
    ResultBean loginout(String token) {

        if (token==null||token==""){
            return ResultUtil.setERROR("未登录");
        } else {
           return ResultUtil.OK();
        }
    }


    @ApiImplicitParams({
            @ApiImplicitParam(name = "email", value = "邮箱", required = true, paramType = "query"),
            @ApiImplicitParam(name = "code", value = "验证码", required = true, paramType = "query"),
    })
    @ApiOperation(value = "用验证码登录",httpMethod = "GET",notes = "邮箱地址，验证码登录账号")
    @GetMapping("user/forgetpass.do")
    ResultBean forgetPass(@Param("email") String email,@Param("code") String code) {

        if (email==null||email==""||code==null||code==""){
            return ResultUtil.setERROR("请输入正确验证码");
        } else {
            ResultBean resultBean = userService.loginByCode(email,code);
            if (resultBean.getCode()==1000){
                resultBean.setMsg("验证码校验成功");
            }else {
                resultBean.setMsg("验证码校验失败");
            }


            return resultBean;
        }
    }
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "token令牌", required = true, paramType = "query"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, paramType = "query")
    })

    @ApiOperation(value = "设置新密码",httpMethod = "GET",notes = "传入token来重置密码")
    @GetMapping("user/newpass.do")
    ResultBean newPass(@Param("token") String token,@Param("password") String password) {

        if (token==null||token==""||password==null||password==""){
            return ResultUtil.setERROR("请检查登录状态");
        } else {
            return userService.newPass(token,password);
        }
    }

    @ApiOperation(value = "用户详情",httpMethod = "GET",notes = "传入token来重置密码")
    @GetMapping("user/userinfo.do")
    ResultBean userInfo(@Param("token") String token) {

        if (token==null||token==""){
            return ResultUtil.setERROR("请检查登录状态");
        } else {
            return userService.userInfo(token);
        }
    }


    @ApiOperation(value = "修改用户详情",httpMethod = "GET",notes = "传来user对象")
    @GetMapping("user/updateinfo.do")
    ResultBean updateInfo(@Param("user")Tuser user) {

        if (user==null){
            return ResultUtil.setERROR("请输入信息");
        } else {
            return userService.updateUser(user);
        }
    }


}
