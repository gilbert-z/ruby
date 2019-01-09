package com.qfedu.ruby.service;

import com.qfedu.ruby.vo.Vcomment;

import java.util.List;

public interface TcommentService {

    List<Vcomment> selectBySid(Integer sid);
}
