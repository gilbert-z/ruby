package com.qfedu.ruby.dao;

import com.qfedu.ruby.pojo.Torderdetail;

public interface TorderdetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Torderdetail record);

    int insertSelective(Torderdetail record);

    Torderdetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Torderdetail record);

    int updateByPrimaryKey(Torderdetail record);
}