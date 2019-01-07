package com.qfedu.ruby.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping("hi")
    String sayhi(){
        return "hello";
    }
}
