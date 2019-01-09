package com.qfedu.ruby.util.token;

import com.alibaba.fastjson.JSON;
import com.qfedu.ruby.constant.SystemCon;
import com.qfedu.ruby.util.EncrypUtil;

public class TokenParse {

    //解析令牌
    public static int getUid(String token){
        String json= EncrypUtil.decAesStr(SystemCon.TOKENKEY,token);
        Token token1=JSON.parseObject(json,Token.class);
        return token1.getId();
    }
}
