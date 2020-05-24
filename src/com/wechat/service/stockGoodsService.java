package com.wechat.service;

import com.wechat.po.b_color;
import com.wechat.po.goods;
import java.util.List;

public abstract interface stockGoodsService
{
  public abstract List<goods> get_stock_data(String paramString);
  
  public abstract List<b_color> get_colorData();
  
  public abstract void insert_stock(goods paramgoods);
  
  public void update_stock(goods paramgoods);
  
  public void delete_f002Data(String paramString);

  public void  update_f002qua(String quatity,String goodsid,String fileds,String size_classs,String colorid);
  public void  update_f002quajia(String quatity,String goodsid,String colorid, String Filed);
}


/* Location:           C:\Users\陈国基\Desktop\java_api_wechat.zip
 * Qualified Name:     WEB-INF.classes.com.wechat.service.stockGoodsService
 * JD-Core Version:    0.7.0.1
 */