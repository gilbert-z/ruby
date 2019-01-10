package com.qfedu.ruby.test;

import com.qfedu.ruby.constant.SystemCon;
import com.qfedu.ruby.util.EncrypUtil;

public class Pass_Main {
    public static void main(String[] args) {
        String str="123456";
        String str2=EncrypUtil.encAesStr(SystemCon.TOKENKEY,str);
        System.out.println(str2);

        System.out.println(EncrypUtil.decAesStr(SystemCon.TOKENKEY,str2));
    }
}
