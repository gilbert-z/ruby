package com.qfedu.ruby.controller;

import com.qfedu.ruby.pojo.Tgoods;
import com.qfedu.ruby.pojo.Tgoodsbrand;
import com.qfedu.ruby.service.tGoodsBrandService;
import com.qfedu.ruby.util.ResultBean;
import com.qfedu.ruby.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "选购品牌模块",tags = "所有品牌，")
@RestController
public class GoodsBrandController {
    @Autowired
    private tGoodsBrandService tbs;
    @ApiOperation(value = "选购品牌接口",httpMethod = "GET",notes = "查询所有品牌")
    @CrossOrigin
    @GetMapping("/tbs/selectAll.do")
    public ResultBean selectAll(){
        ResultBean rb = new ResultBean();
        if(tbs.selectAll() != null){
            List<Tgoodsbrand> list = tbs.selectAll();
            rb = ResultUtil.SUCCESS(list,"chenggong");
        }else{
            ResultUtil.ERROR();
        }

        return rb;
    }

    @ApiOperation(value = "点击品牌显示对应商品列表",httpMethod = "GET",notes = "参数是品牌id")
    @CrossOrigin
    @GetMapping("/tbs/goodsList.do")
    public ResultBean goodsList(Integer bid) {
        if (tbs.selectById(bid)!=null){
            Tgoods tgoods = tbs.selectById(bid);
            return ResultUtil.SUCCESS(tgoods,"chenggong");
        }else{
            return ResultUtil.ERROR();
        }
    }


}
