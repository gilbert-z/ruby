package com.qfedu.ruby.service;

import com.qfedu.ruby.pojo.Tshare;
import com.qfedu.ruby.vo.Vtshare;

import java.util.List;

public interface tShareService {

    List<Vtshare> selectAll();

    int updateLookcount(Tshare tshare);

    Vtshare selectById(Integer id);

    int updateFlag(Integer id);
}
