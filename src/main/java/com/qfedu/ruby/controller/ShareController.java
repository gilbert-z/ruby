package com.qfedu.ruby.controller;

import com.qfedu.ruby.pojo.Tshare;
import com.qfedu.ruby.service.tShareService;
import com.qfedu.ruby.util.ResultBean;
import com.qfedu.ruby.util.ResultUtil;
import com.qfedu.ruby.vo.Vtshare;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.List;

@Api(value = "发现分享模块",tags = "发现中 分享列表，查看次数（也是详情中阅读数），分享详情")
@RestController
public class ShareController {


    @Autowired
    private tShareService ts;

    @ApiOperation(value = "发现分享列表接口",httpMethod = "GET",notes = "主页的查询所有分享")
    @GetMapping("/ts/selectAll.do")
    @CrossOrigin
    public ResultBean selectAll(){
        ResultBean rb = new ResultBean();
        if(ts.selectAll() != null){
            List<Vtshare> list = ts.selectAll();
            rb = ResultUtil.SUCCESS(list,"sdsds");
        }else{
            ResultUtil.ERROR();
        }

        return rb;
    }



    @ApiOperation(value = "查看次数和阅读次数接口",httpMethod = "POST",notes = "参数是别查看的分享")
    @PostMapping("/ts/updateLookcount.do")
    @CrossOrigin
    public ResultBean updateLookcount(Tshare tshare) {
        ResultBean rb = new ResultBean();
        if(ts.updateLookcount(tshare) > 0) {
            rb = ResultUtil.SUCCESS(null,"sdsds");
        }else{
            ResultUtil.ERROR();
        }
        /*try {
            ts.updateLookcount(tshare);
            rb.setCode(1000);
            rb.setData(null);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            rb.setCode(2000);
            rb.setMsg("error");

        }*/
        return rb;
    }

    @ApiOperation(value = "查看分享详情",httpMethod = "GET",notes = "参数是查看分享的id")
    @GetMapping("/ts/selectById.do")
    @CrossOrigin
    public ResultBean selectById(Integer id){
        if(ts.selectById(id) != null){
            Vtshare vtshare = ts.selectById(id);
            return ResultUtil.SUCCESS(vtshare,"adsd");
        }else{
           return ResultUtil.ERROR();
        }
    }

    @ApiOperation(value = "收藏次数接口",httpMethod = "POST",notes = "参数是查看的分享的id,点击收藏调用，收藏次数+1")
    @PostMapping("/ts/updateFlag.do")
    @CrossOrigin
    public ResultBean updateFlag(Integer id) {
        ResultBean rb = new ResultBean();
        if(ts.updateFlag(id) > 0) {
            rb = ResultUtil.SUCCESS(null,"收藏成功");
        }else{
            ResultUtil.ERROR();
        }
        return rb;
    }


    @ApiOperation(value = "分享中类似商品展示接口",httpMethod = "GET",notes = "参数是分享的id")
    @GetMapping("/cs/selectShareGoods.do")
    @CrossOrigin
    public ResultBean selectShareGoods(Integer id) {
        return ts.selectShareGoods(id);
    }
}
