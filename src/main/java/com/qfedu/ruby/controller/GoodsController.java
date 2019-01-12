package com.qfedu.ruby.controller;

import com.qfedu.ruby.pojo.Tgoods;
import com.qfedu.ruby.service.GoodsService;
import com.qfedu.ruby.util.ResultBean;
import com.qfedu.ruby.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Api(value = "首页特价等链接",tags = "根据特点查询商品详情")
@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;


    @ApiImplicitParam(name = "gtype", value = "商品类型", required=true,paramType="query")
    @ApiOperation(value = "获取商品列表",httpMethod = "GET",notes = "根据传入类型")
    @GetMapping("goods/goodslist.do")
    ResultBean goodsList(Integer gtype){
        if (gtype==null){
            return goodsService.showGoodslist(1);
        }else {
            return goodsService.showGoodslist(gtype);
        }
    }
    @ApiOperation(value = "特价产品",httpMethod = "GET",notes = "展示指定列表")
    @GetMapping("goods/showSale.do")
    ResultBean showSale(){
        ResultBean resultBean = goodsService.showSale();

        return resultBean;
    }

    @ApiOperation(value = "贱货排名",httpMethod = "GET",notes = "展示指定列表")
    @GetMapping("goods/showExpensive.do")
    ResultBean showExpensive(){
        ResultBean resultBean = goodsService.showExpensive();

        return resultBean;
    }
    @ApiOperation(value = "新品上架",httpMethod = "GET",notes = "展示指定列表")
    @GetMapping("goods/showNewGoods.do")
    ResultBean showNewGoods(){
        ResultBean resultBean = goodsService.showNewGoods();

        return resultBean;
    }


    @ApiOperation(value = "今日热门",httpMethod = "GET",notes = "展示指定列表")
    @GetMapping("goods/ByCollection.do")
    ResultBean showByCollection(){
        ResultBean resultBean = goodsService.showByCollection();

        return resultBean;
    }


    @ApiImplicitParam(name = "gname", value = "商品名", paramType="query")
    @ApiOperation(value = "搜索商品",httpMethod = "GET",notes = "根据传入类型")
    @GetMapping("goods/goodsSearch.do")
    ResultBean goodsSearch(String gname){
        if (gname==null){
            return goodsService.showByCollection();
        }else {
            return goodsService.showSeach(gname);
        }
    }
}
