 package com.wechat.controller;
 
 import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.po.Spec_parameter;
import com.wechat.po.goods;
import com.wechat.service.goodsService;
 
 @Controller
 public class goodsController
 {
   @Autowired
   private goodsService goodsService;
   
   @RequestMapping({"/goodsAlldetails"})
   @ResponseBody
   public List register()
   {
     return this.goodsService.select_Allgoods();
   }
   
   @RequestMapping({"/select_bygoods"})
   @ResponseBody
   public List select_bygoods(String type, String sex, String yearseason)
   {
     return this.goodsService.select_bygoods(type, sex, yearseason);
   }
   
   @RequestMapping({"/search_goods"})
   @ResponseBody
   public List search_goods(String parameter, HttpServletResponse response, HttpServletRequest request)
   {
     try
     {
       parameter = URLDecoder.decode(parameter, "utf-8");
     }
     catch (UnsupportedEncodingException e)
     {
       e.printStackTrace();
     }
     System.out.println(parameter);
     return this.goodsService.search_goods(parameter);
   }
   
   @RequestMapping({"/goods_OneDetails"})
   @ResponseBody
   public  List<Map<String, Object>> goods_OneDetails(String parameter)
   {
     return this.goodsService.goods_OneDetails(parameter);
   }
   
   @RequestMapping({"/goods_pic"})
   @ResponseBody
   public List<Map<String, Object>> goods_pic(String parameter)
   {
	
//     
//     for(int i=0;i<listdata.size();i++) {
//    	 List data=new ArrayList();
//    	 data.add(listdata.get(i));
//    	 
//     }
    
     
//     if (g != null)
//     {
//       list.add(g.getUrl1());
//       list.add(g.getUrl2());
//       list.add(g.getUrl3());
//       list.add(g.getUrl4());
//       list.add(g.getUrl5());
//       list.add(g.getUrl6());
//       list.add(g.getUrl7());
//       list.add(g.getUrl8());
//       list.add(g.getUrl9());
//       list1.add(g.getLun_url1());
//       list1.add(g.getLun_url2());
//       list1.add(g.getLun_url3());
//       list1.add(g.getLun_url4());
//       list0.add(list);
//       list0.add(list1);
//     }
//     return list0;
     return this.goodsService.goods_style_pic(parameter);
   }
   
   @RequestMapping({"/get_Color_code"})
   @ResponseBody
   public List get_Color_code(String parameter)
   {
     List<List> good = new ArrayList();
     good.add(this.goodsService.get_Color_code(parameter));
     System.out.println(good);
     return good;
   }
   
   @RequestMapping({"/get_b_goods"})
   @ResponseBody
   public List get_b_goods()
   {
     return this.goodsService.get_b_goods();
   }
   
   @RequestMapping({"/insert_b_goods"})
   @ResponseBody
   public void test(goods g)
   {
     this.goodsService.insert_b_goods(g);
   }
   
   //��ȡĳһ������е���ɫ
   @RequestMapping({"/get_styleidcolor"})
   @ResponseBody
   public List<Map<String,Object>>  get_styleidcolor(String  style_id)
   {
	   System.out.println(style_id);
     return this.goodsService.get_styleidcolor(style_id);
   }
   
   //��ȡĳһ��ŵĹ�����
   @RequestMapping({"/get_spec_parameter"})
   @ResponseBody
   public Spec_parameter  get_spec_parameter(String  goods_no)
   {
	   System.out.println(goods_no);
     return this.goodsService.get_spec_parameter(goods_no);
   }
 }


