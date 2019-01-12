package com.qfedu.ruby.dao;

import com.qfedu.ruby.pojo.Taddress;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "TaddressMapper")
public interface TaddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Taddress record);

    int insertSelective(Taddress record);

    Taddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Taddress record);

    int updateByPrimaryKey(Taddress record);

    List<Taddress> selectAll(Integer uid);

    int updateByFlag(Integer uid);

    int updateFlagByUid(@Param("id") Integer id);

    Taddress selectFlagByUid(Integer uid);
}