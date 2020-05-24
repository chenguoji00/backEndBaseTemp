 package com.wechat.service.impl;
 
 import com.wechat.dao.basicGoodsDao;
 import com.wechat.po.goods;
 import com.wechat.service.basicGoodsService;
 import java.util.ArrayList;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;
 
 @Service
 @Transactional
 public class basicGoodsServiceImpl
   implements basicGoodsService
 {
   @Autowired
   private basicGoodsDao basicGoodsDao;
   
   public List<String> getList(String id)
   {
     List<String> list = new ArrayList();
     String[] str = id.split(",");
     for (int i = 0; i < str.length; i++) {
       list.add(str[i]);
     }
     return list;
   }
   
   public void delete_b_goods(String id)
   {
     List<String> list = getList(id);
     this.basicGoodsDao.delete_b_goods(list);
   }
   
   public List get_somegoods(String goodlabel)
   {
     return this.basicGoodsDao.get_somegoods(goodlabel);
   }
   
   public void update_basicgoods(goods g)
   {
     this.basicGoodsDao.update_basicgoods(g);
   }
 }


