package com.qfedu.ruby.constant;

/**
 *@Author feri
 *@Date Created in 2018/11/28 09:28
 */
public class SystemCon {

    //字符串常量
    public static final String OK="成功";
    public static final String ERROR="失败";

    //请求方式
    public static final String GET="GET";
    public static final String POST="POST";

    //需要用到秘钥  AES
    public static final String TOKENKEY="esVw/yXVjmLDghKt+W6J5w==";
    public static final String PASSKEY="xQyfQmWAlLQCT9Y5Gxh2IQ==";

    //token对应的redis的key
    public static final String TOKENHASH="usertokens";
    public static final String TOKECOOKIE="usertoken";
    public static final String TOKENPRE="token:";


}
