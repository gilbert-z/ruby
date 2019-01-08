package com.qfedu.ruby.dao;

import com.qfedu.ruby.pojo.Tgoodsimg;

public interface TgoodsimgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tgoodsimg record);

    int insertSelective(Tgoodsimg record);

    Tgoodsimg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tgoodsimg record);

    int updateByPrimaryKey(Tgoodsimg record);
}