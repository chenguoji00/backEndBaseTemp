package com.wechat.service;

import java.util.List;
import java.util.Map;

import com.wechat.po.OrderItem;

public interface order_detailsService {
	public List<Map<String, Object>>  getorderdetails(OrderItem oi);
}
