package com.qfedu.ruby.controller;

import com.qfedu.ruby.service.GoodsService;
import com.qfedu.ruby.util.ResultBean;
import com.qfedu.ruby.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Api(value = "商品详情模块",tags = "根据商品id查询商品详情")
@RestController
public class GoodsDetailController {

    @Autowired
    private GoodsService goodsService;
    @ApiImplicitParam(name = "gid", value = "商品id", required=true,paramType="query")
    @ApiOperation(value = "获取商品详情",httpMethod = "GET",notes = "输入gid")
    @GetMapping("gd/showdetail.do")
    ResultBean showDetail(Integer gid){

        if (gid==null){
            return ResultUtil.ERROR();
        }else {
            return goodsService.showGoodsDetail(gid);
        }
    }
}
