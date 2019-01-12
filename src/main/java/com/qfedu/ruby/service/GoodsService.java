package com.qfedu.ruby.service;

import com.qfedu.ruby.util.ResultBean;

public interface GoodsService {

    //查询商品详情
    ResultBean showGoodsDetail(Integer gid);

    ResultBean showGoodslist(Integer gtype);

    /**
     * 展示便宜的
     * @return
     */
    ResultBean showSale();
    /**
     *展示贵的
     * @return
     */
    ResultBean showExpensive();
    /**
     *展示新的
     * @return
     */
    ResultBean showNewGoods();

    /**
     *展示最多收藏列表
     * @return
     */
    ResultBean showByCollection();

    /**
     *展示搜素的内容
     * @return
     */
    ResultBean showSeach(String gname);
}
