package com.qfedu.ruby.dao;

import com.qfedu.ruby.pojo.Tcomment;

public interface TcommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tcomment record);

    int insertSelective(Tcomment record);

    Tcomment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tcomment record);

    int updateByPrimaryKey(Tcomment record);
}