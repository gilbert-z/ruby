package com.qfedu.ruby.controller;

import com.qfedu.ruby.pojo.Tcollection;
import com.qfedu.ruby.service.TcollectionService;
import com.qfedu.ruby.util.ResultBean;
import com.qfedu.ruby.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "分享收藏模块",tags = "添加分享收藏")
@RestController
public class CollectionController {

    @Autowired
    private TcollectionService cs;


    @ApiOperation(value = "添加分享收藏接口",httpMethod = "POST",notes = "参数是需要收藏的表")
    @PostMapping("/cs/insertC.do")
    @CrossOrigin
    public ResultBean insertC(Tcollection tcollection){
        if(cs.insertC(tcollection) > 0){
            return ResultUtil.SUCCESS(null,"adsd");
        }else{
            return ResultUtil.ERROR();
        }
    }
}
