package com.qfedu.ruby.controller;

import com.qfedu.ruby.util.token.TokenParse;
import com.qfedu.ruby.util.token.TokenUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {

    @GetMapping("token")
    String tokenTest(){

        return TokenUtil.createToken("lalala",2);

    }

    @GetMapping("token2")
    int tokenpull(String token){

        return TokenParse.getUid(token);

    }
}
