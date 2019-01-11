package com.qfedu.ruby.ServiceImpl;

import com.qfedu.ruby.dao.TcartMapper;
import com.qfedu.ruby.pojo.Tcart;
import com.qfedu.ruby.service.TcartService;
import com.qfedu.ruby.util.ResultBean;
import com.qfedu.ruby.util.ResultUtil;
import com.qfedu.ruby.util.token.TokenParse;
import com.qfedu.ruby.vo.Vcart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TcartServcieImpl implements TcartService {

    @Autowired
    private TcartMapper tcartMapper;

    @Override
    public ResultBean selectCart(String token) {

        //int uid = TokenParse.getUid(token);
        Tcart tcart = new Tcart();
        //tcart.setUid(uid);
        Integer uid = Integer.valueOf(token);
        tcart.setUid(uid);
        if(tcartMapper.selectCart(uid) != null){
            List<Vcart> list = tcartMapper.selectCart(uid);
            System.out.println(list);
            return ResultUtil.SUCCESS(list,"成功啦");
        }else{
            return ResultUtil.ERROR();
        }


    }

    @Override
    public ResultBean addToCard(Tcart tcart) {
        int gid = tcart.getGid();
        int uid = tcart.getUid();
        Tcart cart = tcartMapper.selectbygid(gid,uid);
        if(cart != null){
            int rnum = tcart.getNum();
            int num = rnum + cart.getNum();
            System.out.println("num" + num);
            tcartMapper.updatecounttt(num,uid,gid);
            return  ResultUtil.setOK("已有该商品，商品数加一");
        }else{
            return tcartMapper.insertCart(tcart) > 0 ? ResultUtil.OK() : ResultUtil.ERROR();
        }

    }

    @Override
    public ResultBean updateCount(Integer num, Integer id) {

        return tcartMapper.updatecount(num,id) > 0 ? ResultUtil.OK() : ResultUtil.ERROR();
    }

/*    public ResultBean selectCart(Integer uid) {

        if(tcartMapper.selectCart(uid) != null){
            List<Vcart> list = tcartMapper.selectCart(uid);
            System.out.println(list);
            return ResultUtil.SUCCESS(list,"成功啦");
        }else{
            return ResultUtil.ERROR();
        }


    }*/
}
