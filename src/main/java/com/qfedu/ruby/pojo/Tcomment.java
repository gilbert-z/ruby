package com.qfedu.ruby.pojo;

import java.util.Date;

public class Tcomment {
    private Integer id;

    private Integer viewid;

    private Integer sid;

    private Date createtime;

    private String content;

    private Integer flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getViewid() {
        return viewid;
    }

    public void setViewid(Integer viewid) {
        this.viewid = viewid;
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
        this.content = content == null ? null : content.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}