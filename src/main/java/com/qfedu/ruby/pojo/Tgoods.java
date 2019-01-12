package com.qfedu.ruby.pojo;

import java.util.Date;
import java.util.List;

public class Tgoods {
    private Integer id;

    private String goodsname;

    private String gimg;

    private Integer gprice;

    private Integer gtype;

    private Integer gcount;

    private Integer flag;

    private Date createtime;



    private String brandname;

    private String netweight;

    private String gualityperiod;

    private String address;

    private String content;

    public List<Tgoodsimg> getImgs() {
        return imgs;
    }

    public void setImgs(List<Tgoodsimg> imgs) {
        this.imgs = imgs;
    }

    private List<Tgoodsimg> imgs;

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public String getNetweight() {
        return netweight;
    }

    public void setNetweight(String netweight) {
        this.netweight = netweight;
    }

    public String getGualityperiod() {
        return gualityperiod;
    }

    public void setGualityperiod(String gualityperiod) {
        this.gualityperiod = gualityperiod;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getGimg() {
        return gimg;
    }

    public void setGimg(String gimg) {
        this.gimg = gimg == null ? null : gimg.trim();
    }

    public Integer getGprice() {
        return gprice;
    }

    public void setGprice(Integer gprice) {
        this.gprice = gprice;
    }

    public Integer getGtype() {
        return gtype;
    }

    public void setGtype(Integer gtype) {
        this.gtype = gtype;
    }

    public Integer getGcount() {
        return gcount;
    }

    public void setGcount(Integer gcount) {
        this.gcount = gcount;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}