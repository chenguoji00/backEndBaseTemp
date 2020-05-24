package com.wechat.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.wechat.po.Order_delivery;
import com.wechat.service.order_deliveryService;

@Controller
public class order_deliveryController {
	 @Autowired
	   private order_deliveryService order_deliveryService;
	
	 //�����ջ���ַ��
	   @RequestMapping({"/insertorder_delivery"})
	   @ResponseBody
	   public int insertorder_delivery(Order_delivery od) {
		   System.out.println(od.getCityName());
		   return order_deliveryService.insertorder_delivery(od);
		}
	   
	 //��ѯ�ջ���ַ
	   @RequestMapping({"/getorder_delivery"})
	   @ResponseBody
	   public Order_delivery getorder_delivery(String orderid) {
		   System.out.println(orderid);
		   return order_deliveryService.getorder_delivery(orderid);
		}
}
