package com.qfedu.ruby.pojo;

public class Tgoodsbrand {
    private Integer id;

    private String brandname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname == null ? null : brandname.trim();
    }
}