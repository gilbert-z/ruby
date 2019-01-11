package com.qfedu.ruby.controller;

import com.qfedu.ruby.pojo.Tcomment;
import com.qfedu.ruby.service.TcommentService;
import com.qfedu.ruby.util.ResultBean;
import com.qfedu.ruby.util.ResultUtil;
import com.qfedu.ruby.util.token.TokenParse;
import com.qfedu.ruby.util.token.TokenUtil;
import com.qfedu.ruby.vo.Vcomment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Api(value = "发现的精品评论模块",tags = "发现中每个分享的评论类表")
@RestController
public class CommentController {

    @Autowired
    private TcommentService cs;

    @ApiOperation(value = "查看每个分享中评论的接口",httpMethod = "GET",notes = "参数是根据分享id查询")
    @GetMapping("/cs/selectBySid.do")
    @CrossOrigin
    public ResultBean selectBySid(Integer sid){
        ResultBean rb = new ResultBean();
        if(cs.selectBySid(sid) != null){
            List<Vcomment> list = cs.selectBySid(sid);
            rb = ResultUtil.SUCCESS(list,"成功啦");
        }else{
            return ResultUtil.ERROR();
        }
        return rb;
    }


    @ApiOperation(value = "添加分享评论接口",httpMethod = "POST",notes = "参数是整个评论表类，uid:用户id,sid:分享id")
    @PostMapping("/cs/insert.do")
    @CrossOrigin
    public ResultBean insert(@Param("tcomment") Tcomment tcomment,@Param("token") String token){

            if(cs.insert(tcomment,token) > 0){

                return ResultUtil.OK();
            }else{
                return ResultUtil.ERROR();
            }
    }


}
