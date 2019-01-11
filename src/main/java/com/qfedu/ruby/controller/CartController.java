package com.qfedu.ruby.controller;

import com.qfedu.ruby.pojo.Tcart;
import com.qfedu.ruby.service.TcartService;
import com.qfedu.ruby.util.ResultBean;
import com.qfedu.ruby.util.ResultUtil;
import com.qfedu.ruby.util.token.Token;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@RestController
public class CartController {

    @Autowired
    private TcartService tc;

    @ApiOperation(value = "购物车列表接口",httpMethod = "GET",notes = "根据用户，查出该用户购物车类表")
    @GetMapping("/cart/selectCart.do")
    @CrossOrigin
    public ResultBean selectCart(String token){
        if(token != null){
            return tc.selectCart(token);
        }else {
            return ResultUtil.setERROR("请登录");
        }
    }


 /*   @ApiOperation(value = "购物车列表接口",httpMethod = "GET",notes = "根据用户，查出该用户购物车类表")
    @GetMapping("/cart/selectCart.do")
    @CrossOrigin
    public ResultBean selectCart(Integer uid){

            return tc.selectCart(uid);


    }*/

    //为购物车添加商品
    @ApiOperation(value = "添加购物车接口",httpMethod = "POST",notes = "若购物车无该商品则添加，若有数量num加一")
    @PostMapping("/cart/addtocard.do")
    public ResultBean addCard(Tcart tcart) {
        return tc.addToCard(tcart);
    }

    //修改数量
    @ApiOperation(value = "修改购物车中商品数量接口",httpMethod = "GET",notes = "")
    @GetMapping("/cart/updateNum.do")
    public ResultBean updateNum(Integer num,Integer id){

        return tc.updateCount(num,id);
    }
}
