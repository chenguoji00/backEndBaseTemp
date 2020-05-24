package com.wechat.dao;

import java.util.List;
import java.util.Map;

import com.wechat.po.OrderItem;
import com.wechat.po.Order_delivery;
import com.wechat.po.Orders;
import com.wechat.po.goods;

public interface ordersDao {
	public List<Map<String,Object>> getorders_item(List<String> id);
	public List<Map<String,Object>> get_allf002data();
	public List<Map<String,Object>> getordersitem(String userid);
	public void insert_orders(Orders o);
	public List<Map<String,Object>> getorderbyoid(String orderid);
	public int insertgoodsitem(List<OrderItem> list );
	public void update_orderstatus(Orders o);
	public List<Orders> get_orderbyid(String orderid);
	public int update_orderkuaidi(Orders o);
	public List<Map<String,Object>> getinstallgoumai(String goods,String filed,String size_class,String color_show);
	public void update_xiaoliang(goods g);
	public List<Map<String,Object>> getorderbytype(String type); 
	public void delete_order(String orderId);
	public void delete_orderdelivery(String orderId);
	public void delete_orderdetail(String orderId);
	public Order_delivery getaddress(Order_delivery od);
	public void update_closetime(Orders order);
}
