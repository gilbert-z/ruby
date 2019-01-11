package com.qfedu.ruby.service;

import com.qfedu.ruby.pojo.Taddress;
import com.qfedu.ruby.util.ResultBean;

public interface AddressService {

    ResultBean AddAdd(String token, Taddress taddress);

    ResultBean showAllAdd(String token);

    ResultBean setDefaultAdd(Integer addId,String token);

    ResultBean showdefaulAdd(String token);

    ResultBean deladd(Integer addId);
}
