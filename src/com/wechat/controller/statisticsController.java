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
	   //��30����û�������ÿһ���������
	   @RequestMapping({"/user_statistics"})
	   @ResponseBody
	   public List<Map<String, Object>> user_statistics()
	   {
	     return this.statisticsService.user_statistics();
	   }
	   
	   //��30��Ķ���������ÿһ���������
	   @RequestMapping({"/order_statistics"})
	   @ResponseBody
	   public List<Map<String, Object>> order_statistics()
	   {
	     return this.statisticsService.order_statistics();
	   }
	   

	   //���Nǰ����
	   @RequestMapping({"/saletopthree"})
	   @ResponseBody
	   public List<Map<String, Object>> saletopthree()
	   {
	     return this.statisticsService.saletopthree();
	   }
	   
	   //�����ܶ�
	   @RequestMapping({"/saleallmoney"})
	   @ResponseBody
	   public List<Map<String, Object>> saleallmoney()
	   {
	     return this.statisticsService.saleallmoney();
	   }
	   
	 //�ӹ�����
	   @RequestMapping({"/total_purchase"})
	   @ResponseBody
	   public List<Map<String, Object>> total_purchase()
	   {
	     return this.statisticsService.total_purchase();
	   }
	 //�û�����
	   @RequestMapping({"/usertotal"})
	   @ResponseBody
	   public List<Map<String, Object>> usertotal()
	   {
	     return this.statisticsService.usertotal();
	   }
	   
	 // ��ȡ�������ջ�����
	   @RequestMapping({"/getShopaddress"})
	   @ResponseBody
	   public List<Map<String, Object>> getShopaddress()
	   {
	     return statisticsService.getShopaddress();
	   }
	   
	   //��ȡ���ն����ܶ�Ͷ�������
	   @RequestMapping({"/gettodayorder"})
	   @ResponseBody
	   public List<Map<String, Object>> gettodayorder()
	   {
	     return statisticsService.gettodayorder();
	   }
	   
	   //����ʱ�䷶Χ��ȡ��ÿ�ն�������
	   @RequestMapping({"/getorderbetweentime"})
	   @ResponseBody
	   public List<Map<String, Object>> getorderbetweentime(String time1,String time2)
	   {
		   System.out.println(time1);
		   System.out.println(time2);
	     return statisticsService.getorderbetweentime(time1,time2);
	   }
	   
	   
	   
}
