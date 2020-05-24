package com.wechat.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.service.statisticsService;
import com.wechat.service.stockGoodsService;

@Controller

public class statisticsController {
	   @Autowired
	   private statisticsService statisticsService;
	   //近30天的用户数量（每一天的数量）
	   @RequestMapping({"/user_statistics"})
	   @ResponseBody
	   public List<Map<String, Object>> user_statistics()
	   {
	     return this.statisticsService.user_statistics();
	   }
	   
	   //近30天的订单数量（每一天的数量）
	   @RequestMapping({"/order_statistics"})
	   @ResponseBody
	   public List<Map<String, Object>> order_statistics()
	   {
	     return this.statisticsService.order_statistics();
	   }
	   

	   //熱銷前三款
	   @RequestMapping({"/saletopthree"})
	   @ResponseBody
	   public List<Map<String, Object>> saletopthree()
	   {
	     return this.statisticsService.saletopthree();
	   }
	   
	   //销售总额
	   @RequestMapping({"/saleallmoney"})
	   @ResponseBody
	   public List<Map<String, Object>> saleallmoney()
	   {
	     return this.statisticsService.saleallmoney();
	   }
	   
	 //加购总数
	   @RequestMapping({"/total_purchase"})
	   @ResponseBody
	   public List<Map<String, Object>> total_purchase()
	   {
	     return this.statisticsService.total_purchase();
	   }
	 //用户总数
	   @RequestMapping({"/usertotal"})
	   @ResponseBody
	   public List<Map<String, Object>> usertotal()
	   {
	     return this.statisticsService.usertotal();
	   }
	   
	 // 获取各地区收货数量
	   @RequestMapping({"/getShopaddress"})
	   @ResponseBody
	   public List<Map<String, Object>> getShopaddress()
	   {
	     return statisticsService.getShopaddress();
	   }
	   
	   //获取今日订单总额和订单总数
	   @RequestMapping({"/gettodayorder"})
	   @ResponseBody
	   public List<Map<String, Object>> gettodayorder()
	   {
	     return statisticsService.gettodayorder();
	   }
	   
	   //根据时间范围获取到每日订单总数
	   @RequestMapping({"/getorderbetweentime"})
	   @ResponseBody
	   public List<Map<String, Object>> getorderbetweentime(String time1,String time2)
	   {
		   System.out.println(time1);
		   System.out.println(time2);
	     return statisticsService.getorderbetweentime(time1,time2);
	   }
	   
	   
	   
}
