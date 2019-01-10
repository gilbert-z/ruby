package com.qfedu.ruby.dao;

import com.qfedu.ruby.pojo.Tgoods;

public interface TgoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tgoods record);

    int insertSelective(Tgoods record);

    Tgoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tgoods record);

    int updateByPrimaryKey(Tgoods record);
}