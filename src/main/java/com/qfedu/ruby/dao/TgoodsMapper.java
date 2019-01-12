package com.qfedu.ruby.dao;

import com.qfedu.ruby.pojo.Tgoods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

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

    /**
     * 根据类型查询
     * @param gtype
     * @return
     */
    List<Tgoods> selectByType(Integer gtype);
    /**
     * 低价查询
     *
     * @return
     */
    List<Tgoods> selectByAsc();
    /**
     * 高价查询
     *
     * @return
     */
    List<Tgoods> selectByDesc();
    /**
     * 新品查询
     * @param
     * @return
     */
    List<Tgoods> selectByDate();
    /**
     * 查询被收藏最多的列表
     * @param
     * @return
     */
    List<Tgoods> selectByCollection();

    /**
     * 根据名字查询
     * @param
     * @return
     */
    List<Tgoods> selectByGname(String gname);
}