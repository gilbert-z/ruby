package com.qfedu.ruby.pojo;

import java.util.Date;

public class Tgoodsevaluate {
    private Integer id;

    private Integer gid;

    private Integer uid;

    private Integer star;

    private String valuatecontent;

    private Date createtime;

    private Integer flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getValuatecontent() {
        return valuatecontent;
    }

    public void setValuatecontent(String valuatecontent) {
        this.valuatecontent = valuatecontent == null ? null : valuatecontent.trim();
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