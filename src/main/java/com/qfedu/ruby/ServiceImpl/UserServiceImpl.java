package com.qfedu.ruby.ServiceImpl;

import com.alibaba.fastjson.JSON;
import com.qfedu.ruby.constant.SystemCon;
import com.qfedu.ruby.dao.TuserMapper;
import com.qfedu.ruby.pojo.Tuser;
import com.qfedu.ruby.service.UserService;
import com.qfedu.ruby.util.JedisUtil;
import com.qfedu.ruby.util.ResultBean;
import com.qfedu.ruby.util.ResultUtil;
import com.qfedu.ruby.util.token.TokenParse;
import com.qfedu.ruby.util.token.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisPool;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TuserMapper userMapper;


    @Autowired
    private JavaMailSender jms;

    @Value("${spring.mail.username}")
    private String sender;

    JedisPool jedisPool = new JedisPool("47.99.243.62",6379);
    JedisUtil jedisUtil = new JedisUtil(jedisPool,"123");

    //点击获取验证码后，获取邮箱发送的验证码
    @Override
    public ResultBean EmailCode(String email) {
        Random random = new Random();
        //生成随机的4位数验证码
        String code="";
        for (int i=0;i<4;i++)
        {
            code+=random.nextInt(10);
        }

        jedisUtil.addStr(email,code, TimeUnit.MINUTES,30);
        System.out.println("验证码储存为——————"+jedisUtil.getStr(email));
        //建立邮件消息
        SimpleMailMessage message = new SimpleMailMessage();
        //发送者
        message.setFrom(sender);
        //接收者
        message.setTo(email);
        //发送的标题
        message.setSubject("Ruby商城注册验证码");
        //发送的内容
        message.setText("您本次的验证码为:"+code);
        jms.send(message);

        return ResultUtil.OK();
    }

    //使用验证码邮箱名实现注册
    @Override
    public ResultBean register(String email, String code, String password) {
        //判断邮箱是否已存在
        if (userMapper.selectByEmail(email)==0) {
            System.out.println("验证码获取为___________"+jedisUtil.getStr(email));
            //比较验证码是否正确
            if (jedisUtil.isKey(email)&&jedisUtil.getStr(email).equals(code)){
                Tuser user = new Tuser();
                user.setEmail(email);
                user.setPassword(password);
                return userMapper.insert(user)==1?ResultUtil.setOK(SystemCon.OK):ResultUtil.setERROR(SystemCon.ERROR);
            } else {
                return ResultUtil.setERROR("验证码错误");
            }

        }else {
            return ResultUtil.setERROR("账户已存在");
        }

    }

    @Override
    public ResultBean login(String email,String password) {
        //判断账号密码
        Tuser user =userMapper.selectByemailAndPass(email,password);
        if (user!=null){
            //生成token
            //返回给前端
            String token= TokenUtil.createToken(JSON.toJSONString(user),user.getId());
            return ResultUtil.SUCCESS(token,"登录成功");


        }else {
            //账号密码错误
            return ResultUtil.setERROR("账号或密码错误");
        }
    }

    @Override
    public ResultBean loginByCode(String email, String code) {
        //判断邮箱是否存在
        if (userMapper.selectByEmail(email)==1) {

            //比较验证码是否正确
            if (jedisUtil.isKey(email)&&jedisUtil.getStr(email).equals(code)){
                Tuser user = userMapper.selectUserByEmail(email);

                if (user!=null){
                    //生成token
                    //返回给前端
                    String token= TokenUtil.createToken(JSON.toJSONString(user),user.getId());
                    return ResultUtil.SUCCESS(token,"登录成功");
                }else {
                    //账号密码错误
                    return ResultUtil.setERROR("网略异常");
                }

            } else {
                return ResultUtil.setERROR("验证码错误");
            }

        }else {
            return ResultUtil.setERROR("请注册账号");
        }

    }

    @Override
    public ResultBean checkLogin() {
        return null;
    }

    @Override
    public ResultBean loginOut() {
        return null;
    }
    //根据token修改指定的用户密码
    @Override
    public ResultBean newPass(String token, String password) {
        int uid = TokenParse.getUid(token);
        System.out.println("需要修改的uid:"+uid);
        Tuser user = new Tuser();
        user.setId(uid);
        user.setPassword(password);

        return userMapper.updateByPrimaryKeySelective(user)==1?ResultUtil.OK():ResultUtil.setERROR("请检查密码格式");
    }

    @Override
    public ResultBean updateUser(Tuser tuser) {
        return null;
    }

    @Override
    public ResultBean userInfo(String token) {
        int uid = TokenParse.getUid(token);
        Tuser tuser = userMapper.selectInfoByPrimaryKey(uid);

        if (tuser==null){
            return ResultUtil.setERROR("登录状态异常");
        }else {
            return ResultUtil.SUCCESS(tuser,SystemCon.OK);
        }
    }
}
