package com.qfedu.ruby.ServiceImpl;

import com.qfedu.ruby.dao.TgoodsbrandMapper;
import com.qfedu.ruby.pojo.Tgoodsbrand;
import com.qfedu.ruby.service.tGoodsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class tGoodsBrandServiceImpl  implements tGoodsBrandService {

    @Autowired
    private TgoodsbrandMapper tbm;
    @Override
    public List<Tgoodsbrand> selectAll() {
        return tbm.selectAllName();
    }
}
