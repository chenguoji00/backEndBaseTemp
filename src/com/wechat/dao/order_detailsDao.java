package com.wechat.dao;

import java.util.List;
import java.util.Map;

import com.wechat.po.OrderItem;

public interface order_detailsDao {
	public List<Map<String, Object>>  getorderdetails(OrderItem oi);
}
