package com.wechat.service;

import com.wechat.po.Order_delivery;

public interface order_deliveryService {
	public int insertorder_delivery(Order_delivery od);
	public Order_delivery getorder_delivery(String orderid);
}
