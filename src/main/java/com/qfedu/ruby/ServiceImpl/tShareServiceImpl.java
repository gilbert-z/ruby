package com.qfedu.ruby.ServiceImpl;


import com.qfedu.ruby.dao.TshareMapper;
import com.qfedu.ruby.pojo.Tshare;
import com.qfedu.ruby.service.tShareService;
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
}
