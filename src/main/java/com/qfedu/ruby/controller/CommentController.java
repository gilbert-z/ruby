package com.qfedu.ruby.controller;

import com.qfedu.ruby.service.TcommentService;
import com.qfedu.ruby.util.ResultBean;
import com.qfedu.ruby.util.ResultUtil;
import com.qfedu.ruby.vo.Vcomment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "发现的精品评论模块",tags = "发现中每个分享的评论类表")
@RestController
public class CommentController {

    @Autowired
    private TcommentService cs;

    @ApiOperation(value = "每个分享评论接口",httpMethod = "GET",notes = "参数是根据分享id查询")
    @GetMapping("/cs/selectBySid.do")
    @CrossOrigin
    public ResultBean selectBySid(Integer sid){
        ResultBean rb = new ResultBean();
        if(cs.selectBySid(sid) != null){
            List<Vcomment> list = cs.selectBySid(sid);
            rb = ResultUtil.SUCCESS(list,"成功啦");
        }else{
            ResultUtil.ERROR();
        }
        return rb;
    }
}
