package com.qfedu.ruby.dao;

import com.qfedu.ruby.pojo.Taddress;

public interface TaddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Taddress record);

    int insertSelective(Taddress record);

    Taddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Taddress record);

    int updateByPrimaryKey(Taddress record);
}