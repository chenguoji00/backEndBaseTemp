package com.wechat.dao;

import com.wechat.po.goods;
import java.util.List;

public abstract interface basicGoodsDao
{
  public abstract void delete_b_goods(List<String> paramList);
  
  public abstract List get_somegoods(String paramString);
  
  public abstract void update_basicgoods(goods paramgoods);
  
 
}

