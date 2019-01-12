package com.qfedu.ruby.service;

import com.qfedu.ruby.pojo.Tcart;
import com.qfedu.ruby.util.ResultBean;

public interface TcartService {

    ResultBean selectCart(String token);

    //ResultBean selectCart(Integer uid);

    public ResultBean addToCard(Tcart tcard,String token);

    ResultBean updateCount(Integer count,Integer id);

    public ResultBean buying(Tcart tcart, String token);
}
