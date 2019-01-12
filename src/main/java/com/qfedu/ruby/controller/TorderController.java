package com.qfedu.ruby.controller;

import com.qfedu.ruby.service.TorderService;
import com.qfedu.ruby.util.ResultBean;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TorderController {

    @Autowired
    private TorderService od;

    @ApiOperation(value = "展示订单的接口",httpMethod = "GET",notes = "")
    @GetMapping("/cart/selectOrder.do")
    public ResultBean selectOrder(Integer id){

        return od.selectOrder(id);
    }
}
