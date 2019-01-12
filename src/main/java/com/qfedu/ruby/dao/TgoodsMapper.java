package com.qfedu.ruby.dao;

import com.qfedu.ruby.pojo.Tgoods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component("TgoodsMapper")
public interface TgoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tgoods record);

    int insertSelective(Tgoods record);

    Tgoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tgoods record);

    int updateByPrimaryKey(Tgoods record);
    //查询商品详情
    Tgoods selectGoodsDetail(Integer gid);
}