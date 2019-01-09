package com.qfedu.ruby.dao;

import com.qfedu.ruby.pojo.Tuser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component("TuserMapper")
public interface TuserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tuser record);

    int insertSelective(Tuser record);

    Tuser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tuser record);

    int updateByPrimaryKey(Tuser record);

    int selectByEmail(String email);

    Tuser selectByemailAndPass(@Param("email") String email,@Param("password") String password);
}