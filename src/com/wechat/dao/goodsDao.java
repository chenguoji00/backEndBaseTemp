package com.wechat.dao;

import java.util.List;
import java.util.Map;

import com.wechat.po.Spec_parameter;
import com.wechat.po.goods;

public abstract interface goodsDao
{
  public abstract List<goods> select_Allgoods();
  
  public abstract List<goods> select_bygoods(String paramString1, String paramString2, String paramString3);
  
  public abstract List<goods> search_goods(String paramString);
  
  public abstract List<Map<String, Object>> goods_OneDetails(String paramString);
  
  public abstract List<Map<String, Object>> goods_style_pic(String paramString);
  
  public abstract List<goods> get_Color_code(String paramString);
  
  public abstract List<goods> get_b_goods();
  
  public abstract void insert_b_goods(goods paramgoods);
  
  public List<Map<String,Object>>  get_styleidcolor(String style_id);
  public Spec_parameter get_spec_parameter(String goods_no);
}

