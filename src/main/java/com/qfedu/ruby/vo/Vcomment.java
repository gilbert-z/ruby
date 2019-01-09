package com.qfedu.ruby.vo;

import java.util.Date;

public class Vcomment {
    private Integer id;

    private Integer sid;

    private Date createtime;

    private String content;

    private Integer flag;

    private String username;

    private String userheadimg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserheadimg() {
        return userheadimg;
    }

    public void setUserheadimg(String userheadimg) {
        this.userheadimg = userheadimg;
    }
}
