package com.qfedu.ruby.dao;

import com.qfedu.ruby.pojo.Tsontype;

public interface TsontypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tsontype record);

    int insertSelective(Tsontype record);

    Tsontype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tsontype record);

    int updateByPrimaryKey(Tsontype record);
}