package com.qfedu.ruby.dao;

import com.qfedu.ruby.pojo.Tcart;

public interface TcartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tcart record);

    int insertSelective(Tcart record);

    Tcart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tcart record);

    int updateByPrimaryKey(Tcart record);

}