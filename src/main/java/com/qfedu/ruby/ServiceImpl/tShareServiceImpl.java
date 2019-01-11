package com.qfedu.ruby.ServiceImpl;


import com.qfedu.ruby.dao.TshareMapper;
import com.qfedu.ruby.pojo.Tshare;
import com.qfedu.ruby.service.tShareService;
import com.qfedu.ruby.util.ResultBean;
import com.qfedu.ruby.util.ResultUtil;
import com.qfedu.ruby.vo.VshareGoods;
import com.qfedu.ruby.vo.Vtshare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class tShareServiceImpl implements tShareService {

    @Autowired
    private TshareMapper tm;
    @Override
    public List<Vtshare> selectAll() {
        return tm.selectAll();
    }

    @Override
    public int updateLookcount(Tshare tshare) {

        return tm.updateLookcount(tshare);
    }

    @Override
    public Vtshare selectById(Integer id) {
        return tm.selectById(id);
    }

    @Override
    public int updateFlag(Integer id) {
        return tm.updateFlag(id);
    }

    @Override
    public ResultBean selectShareGoods(Integer id) {
        if(tm.selectShareGoods(id) != null){
            List<VshareGoods> list = tm.selectShareGoods(id);
            return ResultUtil.SUCCESS(list,"成功啦");
        }else{
            return ResultUtil.ERROR();
        }
    }
}
