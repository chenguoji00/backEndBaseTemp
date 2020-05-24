package com.wechat.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.po.Order_delivery;
import com.wechat.po.Orders;
import com.wechat.service.ordersService;

@Controller
public class ordersController {

	@Autowired
	private ordersService ordersService;

	// 获取到订单的款信息，用于展示小程序端orders展示订单
	@RequestMapping({ "/getorders_item" })
	@ResponseBody
	public List<Map<String, Object>> getorders_item(String id) {
		return this.ordersService.getorders_item(id);
	}

	// 获取库存表的所有数据然后存储在小程序端去用于查询搜索
	@RequestMapping({ "/get_allf002data" })
	@ResponseBody
	public List<Map<String, Object>> get_allf002data() {
		return this.ordersService.get_allf002data();
	}

	// 获取库存表的所有数据然后存储在小程序端去用于查询搜索
	@RequestMapping({ "/getordersitem" })
	@ResponseBody
	public Map<String, List> getordersitem(String userid) {
		List<Map<String, Object>> list = ordersService.getordersitem(userid);

		Map<String, List> resultMap = new HashMap<String, List>();
		for (Map<String, Object> map : list) {
			if (resultMap.containsKey(map.get("orderId").toString())) {
				resultMap.get(map.get("orderId").toString()).add(map);
			} else {
				List<Map<String, Object>> tempList = new ArrayList<Map<String, Object>>();
				tempList.add(map);
				resultMap.put(map.get("orderId").toString(), tempList);
			}
		}
		return resultMap;
	}

	// 插入到订单表数据
	@RequestMapping({ "/insert_orders" })
	@ResponseBody
	public void insert_orders(Orders o) {
		this.ordersService.insert_orders(o);
	}

	// 根据订单编号获取订单下的款有哪些
	@RequestMapping({ "/getorderbyoid" })
	@ResponseBody
	public List<Map<String, Object>> getorderbyoid(String orderid) {
		return this.ordersService.getorderbyoid(orderid);
	}

	// 根据订单编号获取订单下的款有哪些
	@RequestMapping({ "/insertgoodsitem" })
	@ResponseBody
	public int insertgoodsitem(String sgoodsid, String order_id, String snum, String sFiled, String ssizeclass,
			String sColorid) {
		return this.ordersService.insertgoodsitem(sgoodsid, order_id, snum, sFiled, ssizeclass, sColorid);
	}

	// 更改订单状态
	@RequestMapping({ "/update_orderstatus" })
	@ResponseBody
	public void update_orderstatus(Orders o) {
		this.ordersService.update_orderstatus(o);
	}

	// 后台根据订单查询订单信息
	@RequestMapping({ "/get_orderbyid" })
	@ResponseBody
	public List<Orders> get_orderbyid(String orderid) {
		return this.ordersService.get_orderbyid(orderid);
	}

	// 后台 修改订单的快递单号
	@RequestMapping({ "/update_orderkuaidi" })
	@ResponseBody
	public int update_orderkuaidi(Orders o) {
		return this.ordersService.update_orderkuaidi(o);
	}

	// 后台 修改订单的快递单号
	@RequestMapping({ "/getinstallgoumai" })
	@ResponseBody
	public List<Map<String, Object>> getinstallgoumai(String goods, String filed, String size_class,
			String color_show) {
		return this.ordersService.getinstallgoumai(goods, filed, size_class, color_show);
	}

	// 后台 修改订单的快递单号
	@RequestMapping({ "/update_xiaoliang" })
	@ResponseBody
	public void update_xiaoliang(String Quantity, String style_id) {
		System.out.println(Quantity);
		System.out.println(style_id);
		this.ordersService.update_xiaoliang(Quantity, style_id);
	}

	// 后台 根据状态类型或许订单表数据
	@RequestMapping({ "/getorderbytype" })
	@ResponseBody
	public List<Map<String, Object>> getorderbytype(String type) {
		return ordersService.getorderbytype(type);
	}

	// 后台删除订单
	@RequestMapping({ "/delete_order" })
	@ResponseBody
	public void delete_order(String orderId) {
		ordersService.delete_order(orderId);
	}

	// 小程序获取地址
	@RequestMapping({ "/getaddress" })
	@ResponseBody
	public Order_delivery getaddress(Order_delivery od) {
		return ordersService.getaddress(od);
	}
	// 结束订单时间
	@RequestMapping({ "/update_closetime" })
	@ResponseBody
	public void update_closetime(Orders orders) {
		 ordersService.update_closetime(orders);
	}
	
}
