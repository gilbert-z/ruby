package com.qfedu.ruby.dao;

import com.qfedu.ruby.pojo.Tgoodstype;

public interface TgoodstypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tgoodstype record);

    int insertSelective(Tgoodstype record);

    Tgoodstype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tgoodstype record);

    int updateByPrimaryKey(Tgoodstype record);
}