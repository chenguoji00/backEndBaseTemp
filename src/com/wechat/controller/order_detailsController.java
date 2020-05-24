package com.wechat.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.po.OrderItem;
import com.wechat.service.order_detailsService;

@Controller
public class order_detailsController {
	@Autowired
	   private order_detailsService order_detailsService;
	
	
	//获取详情表
	   @RequestMapping({"/getorderdetails"})
	   @ResponseBody
	   public List<Map<String, Object>> getorderdetails(OrderItem oi) {
		   System.out.println(oi.getOrder_id());
		   return order_detailsService.getorderdetails(oi);
		}
}
