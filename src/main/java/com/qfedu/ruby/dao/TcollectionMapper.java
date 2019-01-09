package com.qfedu.ruby.dao;

import com.qfedu.ruby.pojo.Tcollection;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "TcollectionMapper")
public interface TcollectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tcollection record);

    int insertSelective(Tcollection record);

    Tcollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tcollection record);

    int updateByPrimaryKey(Tcollection record);

    int insertC(Tcollection tcollection);

    Tcollection selectByUSid(Integer uid, Integer sid);
}