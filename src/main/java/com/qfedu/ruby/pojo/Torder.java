package com.qfedu.ruby.pojo;

import com.qfedu.ruby.vo.Vorder;

import java.util.Date;
import java.util.List;

public class Torder {
    private Integer id;

    private Integer uid;

    private Integer money;

    private String msg;

    private Integer addressid;

    private Date createtime;

    private Integer flag;

    private Taddress taddress;

    public Taddress getTaddress() {
        return taddress;
    }

    public void setTaddress(Taddress taddress) {
        this.taddress = taddress;
    }

    private List<Vorder> Vorders;

    public List<Vorder> getVorders() {
        return Vorders;
    }

    public void setVorders(List<Vorder> vorders) {
        Vorders = vorders;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}