 package com.wechat.service.impl;
 
 import com.wechat.dao.goodsDao;
import com.wechat.po.Spec_parameter;
import com.wechat.po.goods;
 import com.wechat.service.goodsService;
 import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;
 
 @Service
 @Transactional
 public class goodsServiceImpl
   implements goodsService
 {
   @Autowired
   private goodsDao goodsDao;
   
   public List<goods> select_Allgoods()
   {
     List<goods> good = this.goodsDao.select_Allgoods();
     return good;
   }
   
   public List<goods> select_bygoods(String type, String sex, String yearseason)
   {
     List<goods> good = this.goodsDao.select_bygoods(type, sex, yearseason);
     return good;
   }
   
   public List<goods> search_goods(String parameter)
   {
     List<goods> good = this.goodsDao.search_goods(parameter);
     return good;
   }
   
   public  List<Map<String, Object>> goods_OneDetails(String parameter)
   {
     
     return this.goodsDao.goods_OneDetails(parameter);
   }
   
   public List<Map<String, Object>> goods_style_pic(String parameter)
   {
     
     return this.goodsDao.goods_style_pic(parameter);
   }
   
   public List<goods> get_Color_code(String parameter)
   {
     List<goods> good = this.goodsDao.get_Color_code(parameter);
     return good;
   }
   
   public List<goods> get_b_goods()
   {
     List<goods> good = this.goodsDao.get_b_goods();
     return good;
   }
   
   public void insert_b_goods(goods g)
   {
     this.goodsDao.insert_b_goods(g);
   }

@Override
public List<Map<String, Object>> get_styleidcolor(String style_id) {
	// TODO Auto-generated method stub
	return this.goodsDao.get_styleidcolor(style_id);
}

@Override
public Spec_parameter get_spec_parameter(String goods_no) {
	// TODO Auto-generated method stub
	return this.goodsDao.get_spec_parameter(goods_no);
}


 }


