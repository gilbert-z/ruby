package com.qfedu.ruby.ServiceImpl;

import com.qfedu.ruby.constant.SystemCon;
import com.qfedu.ruby.dao.TaddressMapper;
import com.qfedu.ruby.pojo.Taddress;
import com.qfedu.ruby.service.AddressService;
import com.qfedu.ruby.util.ResultBean;
import com.qfedu.ruby.util.ResultUtil;
import com.qfedu.ruby.util.token.TokenParse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    TaddressMapper taddressMapper;

    @Override
    public ResultBean AddAdd(String token, Taddress taddress) {


         int uid = TokenParse.getUid(token);
        System.out.println("添加地址的"+taddress.getAddress());
         taddress.setUid(uid);

         int i = taddressMapper.insert(taddress);

        return i==1? ResultUtil.OK():ResultUtil.ERROR();
    }
    //展示所有地址
    @Override
    public ResultBean showAllAdd(String token) {

        List<Taddress> adds = taddressMapper.selectAll(TokenParse.getUid(token));
        if (adds==null){
            return ResultUtil.setERROR("请登录");
        }else {
            return ResultUtil.SUCCESS(adds, SystemCon.OK);
        }
    }
    //设置默认收货地址
    @Override
    public ResultBean setDefaultAdd(Integer addId,String token) {

        Integer uid = TokenParse.getUid(token);
        //所有该用户地址修改为非默认
        if (taddressMapper.updateByFlag(uid)!=0){
            //修改指定用户地址为默认
            if (taddressMapper.updateFlagByUid(addId)!=0){
                return ResultUtil.OK();
            }
        }

        return ResultUtil.setERROR("修改失败");
    }
    //展示默认收货地址若没有则展示第一个
    @Override
    public ResultBean showdefaulAdd(String token) {
        Integer uid = TokenParse.getUid(token);
        Taddress add = taddressMapper.selectFlagByUid(uid);
        if (add==null){
            return ResultUtil.setERROR("请登录");
        }else {
            return ResultUtil.SUCCESS(add, SystemCon.OK);
        }
    }

    @Override
    public ResultBean deladd(Integer addId) {

        return taddressMapper.deleteByPrimaryKey(addId)==1?ResultUtil.OK():ResultUtil.ERROR();
    }


}
