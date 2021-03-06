package com.qfedu.ruby.ServiceImpl;

import com.qfedu.ruby.constant.SystemCon;
import com.qfedu.ruby.dao.TgoodsMapper;
import com.qfedu.ruby.pojo.Tgoods;
import com.qfedu.ruby.service.GoodsService;
import com.qfedu.ruby.util.ResultBean;
import com.qfedu.ruby.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private TgoodsMapper goodsMapper;

    @Override
    public ResultBean showGoodsDetail(Integer gid) {
        Tgoods goods= goodsMapper.selectGoodsDetail(gid);
        if (goods==null){
            return ResultUtil.setERROR("已下架");
        }else {
            return ResultUtil.SUCCESS(goods, SystemCon.OK);
        }
    }
    //根据类型返回商品列表
    @Override
    public ResultBean showGoodslist(Integer gtype) {

        List<Tgoods> goods= goodsMapper.selectByType(gtype);
        if (goods==null){
            return ResultUtil.ERROR();
        }else {
            return ResultUtil.SUCCESS(goods,SystemCon.OK);
        }
    }

    @Override
    public ResultBean showSale() {
        List<Tgoods> goods= goodsMapper.selectByAsc();
        if (goods==null){
            return ResultUtil.ERROR();
        }else {
            return ResultUtil.SUCCESS(goods,SystemCon.OK);
        }
    }

    @Override
    public ResultBean showExpensive() {
        List<Tgoods> goods= goodsMapper.selectByDesc();
        if (goods==null){
            return ResultUtil.ERROR();
        }else {
            return ResultUtil.SUCCESS(goods,SystemCon.OK);
        }
    }

    @Override
    public ResultBean showNewGoods() {
        List<Tgoods> goods= goodsMapper.selectByDate();
        if (goods==null){
            return ResultUtil.ERROR();
        }else {
            return ResultUtil.SUCCESS(goods,SystemCon.OK);
        }
    }

    @Override
    public ResultBean showByCollection() {
        List<Tgoods> goods= goodsMapper.selectByCollection();
        if (goods==null){
            return ResultUtil.ERROR();
        }else {
            return ResultUtil.SUCCESS(goods,SystemCon.OK);
        }
    }

    @Override
    public ResultBean showSeach(String gname) {
        String name = "%"+gname+"%";
        List<Tgoods> goods= goodsMapper.selectByGname(name);
        if (goods==null){
            return ResultUtil.ERROR();
        }else {
            return ResultUtil.SUCCESS(goods,SystemCon.OK);
        }
    }
}
