package com.qfedu.ruby.controller;

import com.qfedu.ruby.service.TcommentService;
import com.qfedu.ruby.util.ResultBean;
import com.qfedu.ruby.util.ResultUtil;
import com.qfedu.ruby.vo.Vcomment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentController {

    @Autowired
    private TcommentService cs;

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
