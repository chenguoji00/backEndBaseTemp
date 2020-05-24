package com.wechat.dao;

import java.util.List;
import java.util.Map;

public interface statisticsDao {
	public List<Map<String,Object>> user_statistics();
	public List<Map<String,Object>> order_statistics();
	public List<Map<String,Object>> saletopthree();
	public List<Map<String,Object>> saleallmoney();
	public List<Map<String,Object>> total_purchase();
	public List<Map<String,Object>> usertotal(); 
	public List<Map<String,Object>> getShopaddress();
	public List<Map<String,Object>> gettodayorder();
	public List<Map<String,Object>> getorderbetweentime(String time1,String time2);
}
