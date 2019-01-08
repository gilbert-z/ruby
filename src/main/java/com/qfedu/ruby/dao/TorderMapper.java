package com.qfedu.ruby.dao;

import com.qfedu.ruby.pojo.Torder;

public interface TorderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Torder record);

    int insertSelective(Torder record);

    Torder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Torder record);

    int updateByPrimaryKey(Torder record);
}