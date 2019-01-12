package com.qfedu.ruby.dao;

import com.qfedu.ruby.pojo.Tcart;
import com.qfedu.ruby.vo.Vcart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component(value = "TcartMapper")
public interface TcartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tcart record);

    Tcart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tcart record);

    int updateByPrimaryKey(Tcart record);

    List<Vcart> selectCart(Integer uid);

    int insertCart(Tcart tcart);

    Tcart selectbygid(@Param("gid") Integer gid, @Param("uid") Integer uid);

    int updatecounttt(@Param("num") Integer num,@Param("uid") Integer uid,@Param("gid") Integer gid);

    int updatecount(@Param("num") Integer num,@Param("id") Integer id);

    int insertSelective(Tcart tcart);

    Map<String, Object> selectbyid(@Param("gid") Integer gid, @Param("uid") Integer uid);
}