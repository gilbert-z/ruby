package com.qfedu.ruby.dao;

import com.qfedu.ruby.pojo.Tgoodsbrand;

public interface TgoodsbrandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tgoodsbrand record);

    int insertSelective(Tgoodsbrand record);

    Tgoodsbrand selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tgoodsbrand record);

    int updateByPrimaryKey(Tgoodsbrand record);
}