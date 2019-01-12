package com.qfedu.ruby.controller;

import com.qfedu.ruby.pojo.Tgoods;
import com.qfedu.ruby.service.GoodsService;
import com.qfedu.ruby.util.ResultBean;
import com.qfedu.ruby.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("goods/goodslist.do")
    ResultBean goodsList(Integer gtype){
        if (gtype==null){
            return goodsService.showGoodslist(1);
        }else {
            return goodsService.showGoodslist(gtype);
        }
    }

    @GetMapping("goods/showSale.do")
    ResultBean showSale(){
        ResultBean resultBean = goodsService.showSale();

        return resultBean;
    }


    @GetMapping("goods/showExpensive.do")
    ResultBean showExpensive(){
        ResultBean resultBean = goodsService.showExpensive();

        return resultBean;
    }

    @GetMapping("goods/showNewGoods.do")
    ResultBean showNewGoods(){
        ResultBean resultBean = goodsService.showNewGoods();

        return resultBean;
    }
}
