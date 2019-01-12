package com.qfedu.ruby.controller;

import com.qfedu.ruby.service.GoodsService;
import com.qfedu.ruby.util.ResultBean;
import com.qfedu.ruby.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
