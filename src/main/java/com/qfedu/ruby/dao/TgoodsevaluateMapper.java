package com.qfedu.ruby.dao;

import com.qfedu.ruby.pojo.Tgoodsevaluate;

public interface TgoodsevaluateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tgoodsevaluate record);

    int insertSelective(Tgoodsevaluate record);

    Tgoodsevaluate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tgoodsevaluate record);

    int updateByPrimaryKey(Tgoodsevaluate record);
}