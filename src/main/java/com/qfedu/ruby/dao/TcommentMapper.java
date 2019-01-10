package com.qfedu.ruby.dao;

import com.qfedu.ruby.pojo.Tcomment;
import com.qfedu.ruby.vo.Vcomment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "TcommentMapper")
public interface TcommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(Tcomment record);

    Tcomment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tcomment record);

    int updateByPrimaryKey(Tcomment record);

    List<Vcomment> selectBySid(Integer sid);

    @Insert("insert into t_comment(viewid, sid, createtime, content, flag) values(1,#{sid}now(),#{content},#{flag})")
    int insert1(Tcomment record);
}