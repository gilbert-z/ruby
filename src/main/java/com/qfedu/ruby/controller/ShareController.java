package com.qfedu.ruby.controller;

import com.qfedu.ruby.pojo.Tshare;
import com.qfedu.ruby.service.tShareService;
import com.qfedu.ruby.util.ResultBean;
import com.qfedu.ruby.util.ResultUtil;
import com.qfedu.ruby.vo.Vtshare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.List;

@RestController
public class ShareController {


    @Autowired
    private tShareService ts;

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
}
