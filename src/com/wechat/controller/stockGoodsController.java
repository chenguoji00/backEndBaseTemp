 package com.wechat.controller;
 
 import com.wechat.po.goods;
 import com.wechat.service.stockGoodsService;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;
 
 @Controller
 public class stockGoodsController
 {
   @Autowired
   private stockGoodsService stockGoodsService;
   
   @RequestMapping({"/get_stock_data"})
   @ResponseBody
   public List get_stock_data(String styleid)
   {
     return this.stockGoodsService.get_stock_data(styleid);
   }
   
   @RequestMapping({"/get_colorData"})
   @ResponseBody
   public List get_colorData()
   {
     return this.stockGoodsService.get_colorData();
   }
   
   @RequestMapping({"/insert_stock"})
   @ResponseBody
   public void insert_stock(goods g)
   {
	   System.out.println(g.getPic());
     this.stockGoodsService.insert_stock(g);
   }
   
   	//修改库存信息
   @RequestMapping({"/update_stock"})
   @ResponseBody
   public void update_stock(goods g)
   {
	   System.out.println(g.getQuantity());
	   System.out.println(g.getF002_key());
     this.stockGoodsService.update_stock(g);
   }
   
   @RequestMapping({"/delete_f002Data"})
   @ResponseBody
   public void delete_f002Data(String id)
   {
	
     this.stockGoodsService.delete_f002Data(id);
   }
   
   
   @RequestMapping({"/update_f002qua"})//微信小程序提交订单需要把减少库存
   @ResponseBody
   public void update_f002qua(String quatity,String goodsid,String fileds,String size_classs,String colorid)
   {
	
     this.stockGoodsService.update_f002qua(quatity, goodsid,fileds,size_classs,colorid);
   }
   
   @RequestMapping({"/update_f002quajia"})//微信小程序关闭订单的时候需要增加库存
   @ResponseBody
   public void update_f002quajia(String quatity,String goodsid,String colorid, String Filed)
   {
     this.stockGoodsService.update_f002quajia(quatity, goodsid,colorid,Filed);
   }
   
   
   
 }


