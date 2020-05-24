package com.wechat.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wechat.dao.order_detailsDao;
import com.wechat.po.OrderItem;
import com.wechat.service.order_detailsService;
@Service
@Transactional
public class order_detailsServiceImpl implements order_detailsService {

	@Autowired
	   private order_detailsDao order_detailsDao;

	@Override
	public List<Map<String, Object>> getorderdetails(OrderItem oi) {
		// TODO Auto-generated method stub
		return order_detailsDao.getorderdetails(oi);
	}
	
	

}
