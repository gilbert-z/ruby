package com.qfedu.ruby.service;

import com.qfedu.ruby.pojo.Torder;
import com.qfedu.ruby.util.ResultBean;

public interface TorderService {

    ResultBean selectOrder(Integer id);
}
