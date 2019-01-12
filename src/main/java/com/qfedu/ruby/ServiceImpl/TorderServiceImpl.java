package com.qfedu.ruby.ServiceImpl;

import com.qfedu.ruby.dao.TaddressMapper;
import com.qfedu.ruby.dao.TorderMapper;
import com.qfedu.ruby.pojo.Taddress;
import com.qfedu.ruby.pojo.Torder;
import com.qfedu.ruby.service.AddressService;
import com.qfedu.ruby.service.TorderService;
import com.qfedu.ruby.util.ResultBean;
import com.qfedu.ruby.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TorderServiceImpl implements TorderService {

    @Autowired
    private TorderMapper om;

    @Autowired
    private TaddressMapper taddressMapper;

    @Override
    public ResultBean selectOrder(Integer id) {

        Taddress taddress = taddressMapper.selectFlagByUid(1);
        if(om.selectOrder(id) != null){
           Torder t = om.selectOrder(id);
           t.setTaddress(taddress);
            return ResultUtil.SUCCESS(t,"chenggong");
        }else{
            return ResultUtil.ERROR();
        }
    }
}
