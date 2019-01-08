package com.qfedu.ruby.util;

import java.util.List;

public class ResultUtil {
    //简单的成功
    public static ResultBean OK(){
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(1000);
        resultBean.setMsg("成功");
        return resultBean;
    }

    //简单的失败
    public static ResultBean ERROR(){
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(2000);
        resultBean.setMsg("失败");
        return resultBean;
    }
    //推荐：无参数的成功
    public static ResultBean setOK(String msg){
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(1000);
        resultBean.setMsg(msg);
        return resultBean;
    }

    //推荐：无参数的失败
    public static ResultBean setERROR(String msg){
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(2000);
        resultBean.setMsg(msg);
        return resultBean;
    }

    //有参数的成功
    public static ResultBean SUCCESS(Object data, String msg){
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(1000);
        resultBean.setData(data);
        resultBean.setMsg(msg);
        return resultBean;
    }

    //分页操作
    //操作成功
    public static PageBean setPageOK(int page, int limit, int count, List<Object> data){
        PageBean pageBean=new PageBean();
        pageBean.setCode(1000);
        pageBean.setData(data);
        pageBean.setMsg("OK");
        pageBean.setCurrpage(page);
        pageBean.setLimit(limit);
        pageBean.setTotalcount(count);
        pageBean.setTotalpage(count%limit==0?count/limit:count/limit+1);
        return pageBean;
    }
}
