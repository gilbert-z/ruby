package com.qfedu.ruby.service;

import com.qfedu.ruby.pojo.Tgoods;
import com.qfedu.ruby.pojo.Tgoodsbrand;

import java.util.List;

public interface tGoodsBrandService {
    List<Tgoodsbrand> selectAll();
    Tgoods selectById(Integer bid);
}
