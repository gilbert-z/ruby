package com.qfedu.ruby.dao;

import com.qfedu.ruby.pojo.Torder;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "TorderMapper")
public interface TorderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Torder record);

    int insertSelective(Torder record);

    Torder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Torder record);

    int updateByPrimaryKey(Torder record);

    Torder selectOrder(Integer id);
}