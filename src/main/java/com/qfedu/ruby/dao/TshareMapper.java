package com.qfedu.ruby.dao;

import com.qfedu.ruby.pojo.Tshare;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "TshareMapper")
public interface TshareMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tshare record);

    int insertSelective(Tshare record);

    Tshare selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tshare record);

    int updateByPrimaryKeyWithBLOBs(Tshare record);

    int updateByPrimaryKey(Tshare record);
    @Insert(value = "insert into t_share (content) values('111')")
    int inserta();
}