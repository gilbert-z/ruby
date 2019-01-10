package com.qfedu.ruby.service;

import com.qfedu.ruby.pojo.Tuser;
import com.qfedu.ruby.util.ResultBean;

public interface UserService {

    public ResultBean EmailCode(String email);

    public ResultBean register(String email,String code,String password);

    public ResultBean login(String email,String password);

    public ResultBean loginByCode(String email,String code);

    public ResultBean checkLogin();

    public ResultBean loginOut();

    public ResultBean newPass(String token,String password);

    public ResultBean updateUser(Tuser tuser);

    public ResultBean userInfo(String token);

}
