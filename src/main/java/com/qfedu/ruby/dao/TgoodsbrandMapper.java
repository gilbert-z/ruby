package com.qfedu.ruby.dao;

import com.qfedu.ruby.pojo.Tgoodsbrand;

import java.util.List;

public interface TgoodsbrandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tgoodsbrand record);

    int insertSelective(Tgoodsbrand record);

    Tgoodsbrand selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tgoodsbrand record);

    int updateByPrimaryKey(Tgoodsbrand record);

    List<Tgoodsbrand> selectAllName();


}