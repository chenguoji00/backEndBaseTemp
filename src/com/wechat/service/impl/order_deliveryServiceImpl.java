package com.wechat.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wechat.dao.order_deliveryDao;
import com.wechat.po.Order_delivery;
import com.wechat.service.order_deliveryService;
@Service
@Transactional
public class order_deliveryServiceImpl implements order_deliveryService {
	
	@Autowired
	   private order_deliveryDao order_deliveryDao;
	
	@Override
	public int insertorder_delivery(Order_delivery od) {
		// TODO Auto-generated method stub
		return order_deliveryDao.insertorder_delivery(od);
	}

	@Override
	public Order_delivery getorder_delivery(String orderid) {
		// TODO Auto-generated method stub
		System.out.println(orderid);
		return order_deliveryDao.getorder_delivery(orderid);
	}

}
