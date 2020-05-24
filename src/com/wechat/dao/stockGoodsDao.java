package com.wechat.dao;

import com.wechat.po.b_color;
import com.wechat.po.goods;
import com.wechat.po.user;

import java.util.List;

public abstract interface stockGoodsDao
{
  public abstract List<goods> get_stock_data(String paramString);
  
  public abstract List<b_color> get_colorData();
  
  public abstract void insert_stock(goods paramgoods);
  
  public void update_stock(goods paramgoods);
  
  public void delete_f002Data(List<String> paramList);
  public void  update_f002qua(String quatity,String goodsid,String fileds,String size_classs,String colorid);
  public void  update_f002quajia(String quatity,String goodsid,String colorid, String Filed);
}

