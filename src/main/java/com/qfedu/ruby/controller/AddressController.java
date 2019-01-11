package com.qfedu.ruby.controller;

import com.qfedu.ruby.pojo.Taddress;
import com.qfedu.ruby.service.AddressService;
import com.qfedu.ruby.util.ResultBean;
import com.qfedu.ruby.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@Api(value = "添加修改默认地址",tags = "地址接口")
@RestController
public class AddressController {

    @Autowired
    private AddressService addService;

    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "令牌", required = true, paramType = "query"),
            @ApiImplicitParam(name = "address", value = "地址对象", required = true, paramType = "query"),
    })
    @ApiOperation(value = "令牌地址对象添加地址",httpMethod = "GET",notes = "添加地址")
    @GetMapping("add/add.do")
    ResultBean newAdd(@Param("token")String token, @Param("address")Taddress address){

        if (token==null||token==""||address==null){
            return ResultUtil.setERROR("请登录");
        }else {
            return addService.AddAdd(token,address);
        }
    }

    @ApiImplicitParam(name = "token", value = "令牌", required = true, paramType = "query")
    @ApiOperation(value = "令牌展示地址",httpMethod = "GET",notes = "展示地址")
    @GetMapping("add/showalladd.do")
    ResultBean showAlladd(String token){
        if (token==null||token==""){
            return ResultUtil.setERROR("请登录");
        }else {
            return addService.showAllAdd(token);
        }
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "令牌", required = true, paramType = "query"),
            @ApiImplicitParam(name = "id", value = "地址id", required = true, paramType = "query"),
    })
    @ApiOperation(value = "令牌地址id设置默认地址",httpMethod = "GET",notes = "设置默认地址")
    @GetMapping("add/setdefaul.do")
    ResultBean setDefaul(@Param("token") String token,@Param("id")Integer id){
        if (token==null||token==""||id==null){
            return ResultUtil.setERROR("请登录");
        }else {
            return addService.setDefaultAdd(id,token);
        }
    }

    @ApiImplicitParam(name = "token", value = "令牌", required = true, paramType = "query")
    @ApiOperation(value = "令牌展示默认地址，如果没有默认展示第一个",httpMethod = "GET",notes = "展示默认地址")
    @GetMapping("add/showdefaul.do")
    ResultBean showDefaul(String token){
        if (token==null||token==""){
            return ResultUtil.setERROR("请登录");
        }else {
            return addService.showdefaulAdd(token);
        }

    }

    @ApiImplicitParam(name = "id", value = "地址id", required = true, paramType = "query")
    @ApiOperation(value = "通过地址id删除地址",httpMethod = "GET",notes = "删除地址")
    @GetMapping("add/deladd.do")
    ResultBean delAdd(Integer id){
        if (id==null||id<1){
            return ResultUtil.setERROR("请登录");
        }else {
            return addService.deladd(id);
        }
    }
}
