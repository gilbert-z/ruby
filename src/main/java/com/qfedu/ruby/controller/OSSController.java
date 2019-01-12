package com.qfedu.ruby.controller;

import com.qfedu.ruby.util.OSSUtil;
import com.qfedu.ruby.util.ResultBean;
import com.qfedu.ruby.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class OSSController {

    @Autowired
    private OSSUtil ossUtil;

    @GetMapping("oss/savehead.do")
    ResultBean addHeadimg(MultipartFile file) throws IOException {

        String name = ossUtil.fileUp(file.getOriginalFilename(),file.getBytes());

        return ResultUtil.SUCCESS(name,"上传成功");

    }
}
