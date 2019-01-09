package com.qfedu.ruby.dao;

import com.qfedu.ruby.pojo.Tcomment;
import com.qfedu.ruby.vo.Vcomment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "TcommentMapper")
public interface TcommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tcomment record);

    int insertSelective(Tcomment record);

    Tcomment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tcomment record);

    int updateByPrimaryKey(Tcomment record);

    List<Vcomment> selectBySid(Integer sid);
}