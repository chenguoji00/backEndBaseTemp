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

	// ��ȡ�������Ŀ���Ϣ������չʾС�����ordersչʾ����
	@RequestMapping({ "/getorders_item" })
	@ResponseBody
	public List<Map<String, Object>> getorders_item(String id) {
		return this.ordersService.getorders_item(id);
	}

	// ��ȡ�������������Ȼ��洢��С�����ȥ���ڲ�ѯ����
	@RequestMapping({ "/get_allf002data" })
	@ResponseBody
	public List<Map<String, Object>> get_allf002data() {
		return this.ordersService.get_allf002data();
	}

	// ��ȡ�������������Ȼ��洢��С�����ȥ���ڲ�ѯ����
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

	// ���뵽����������
	@RequestMapping({ "/insert_orders" })
	@ResponseBody
	public void insert_orders(Orders o) {
		this.ordersService.insert_orders(o);
	}

	// ���ݶ�����Ż�ȡ�����µĿ�����Щ
	@RequestMapping({ "/getorderbyoid" })
	@ResponseBody
	public List<Map<String, Object>> getorderbyoid(String orderid) {
		return this.ordersService.getorderbyoid(orderid);
	}

	// ���ݶ�����Ż�ȡ�����µĿ�����Щ
	@RequestMapping({ "/insertgoodsitem" })
	@ResponseBody
	public int insertgoodsitem(String sgoodsid, String order_id, String snum, String sFiled, String ssizeclass,
			String sColorid) {
		return this.ordersService.insertgoodsitem(sgoodsid, order_id, snum, sFiled, ssizeclass, sColorid);
	}

	// ���Ķ���״̬
	@RequestMapping({ "/update_orderstatus" })
	@ResponseBody
	public void update_orderstatus(Orders o) {
		this.ordersService.update_orderstatus(o);
	}

	// ��̨���ݶ�����ѯ������Ϣ
	@RequestMapping({ "/get_orderbyid" })
	@ResponseBody
	public List<Orders> get_orderbyid(String orderid) {
		return this.ordersService.get_orderbyid(orderid);
	}

	// ��̨ �޸Ķ����Ŀ�ݵ���
	@RequestMapping({ "/update_orderkuaidi" })
	@ResponseBody
	public int update_orderkuaidi(Orders o) {
		return this.ordersService.update_orderkuaidi(o);
	}

	// ��̨ �޸Ķ����Ŀ�ݵ���
	@RequestMapping({ "/getinstallgoumai" })
	@ResponseBody
	public List<Map<String, Object>> getinstallgoumai(String goods, String filed, String size_class,
			String color_show) {
		return this.ordersService.getinstallgoumai(goods, filed, size_class, color_show);
	}

	// ��̨ �޸Ķ����Ŀ�ݵ���
	@RequestMapping({ "/update_xiaoliang" })
	@ResponseBody
	public void update_xiaoliang(String Quantity, String style_id) {
		System.out.println(Quantity);
		System.out.println(style_id);
		this.ordersService.update_xiaoliang(Quantity, style_id);
	}

	// ��̨ ����״̬���ͻ�����������
	@RequestMapping({ "/getorderbytype" })
	@ResponseBody
	public List<Map<String, Object>> getorderbytype(String type) {
		return ordersService.getorderbytype(type);
	}

	// ��̨ɾ������
	@RequestMapping({ "/delete_order" })
	@ResponseBody
	public void delete_order(String orderId) {
		ordersService.delete_order(orderId);
	}

	// С�����ȡ��ַ
	@RequestMapping({ "/getaddress" })
	@ResponseBody
	public Order_delivery getaddress(Order_delivery od) {
		return ordersService.getaddress(od);
	}
	// ��������ʱ��
	@RequestMapping({ "/update_closetime" })
	@ResponseBody
	public void update_closetime(Orders orders) {
		 ordersService.update_closetime(orders);
	}
	
}
