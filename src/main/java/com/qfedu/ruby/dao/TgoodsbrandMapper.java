package com.qfedu.ruby.dao;

import com.qfedu.ruby.pojo.Tgoods;
import com.qfedu.ruby.pojo.Tgoodsbrand;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component(value = "TgoodsbrandMapper")
public interface TgoodsbrandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tgoodsbrand record);

    int insertSelective(Tgoodsbrand record);

    Tgoodsbrand selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tgoodsbrand record);

    int updateByPrimaryKey(Tgoodsbrand record);

    List<Tgoodsbrand> selectAllName();

    Tgoods selectByBid(Integer bid);


}