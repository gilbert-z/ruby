package com.qfedu.ruby.controller;

import com.qfedu.ruby.pojo.Tcollection;
import com.qfedu.ruby.service.TcollectionService;
import com.qfedu.ruby.util.ResultBean;
import com.qfedu.ruby.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollectionController {

    @Autowired
    private TcollectionService cs;

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
