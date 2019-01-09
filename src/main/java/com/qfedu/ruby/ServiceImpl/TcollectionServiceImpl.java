package com.qfedu.ruby.ServiceImpl;

import com.qfedu.ruby.dao.TcollectionMapper;
import com.qfedu.ruby.pojo.Tcollection;
import com.qfedu.ruby.service.TcollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TcollectionServiceImpl implements TcollectionService {


    @Autowired
    private TcollectionMapper cm;
    @Override
    public int insertC(Tcollection tcollection) {
        return insertC(tcollection);
    }
}
