package com.wechat.service;

import com.wechat.po.goods;
import java.util.List;

public abstract interface basicGoodsService
{
  public abstract void delete_b_goods(String paramString);
  
  public abstract List get_somegoods(String paramString);
  
  public abstract void update_basicgoods(goods paramgoods);
}

