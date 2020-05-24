package com.wechat.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wechat.dao.ordersDao;
import com.wechat.po.OrderItem;
import com.wechat.po.Order_delivery;
import com.wechat.po.Orders;
import com.wechat.po.goods;
import com.wechat.service.ordersService;
@Service
@Transactional
public class ordersServiceImpl implements ordersService {
	 @Autowired
	   private ordersDao ordersDao;
	 
	 
	 
	 public List<String> getList(String id)
	   {
	     List<String> list = new ArrayList();
	     String[] str = id.split(",");
	     for (int i = 0; i < str.length; i++) {
	       list.add(str[i]);
	     }
	     return list;
	   }
	 
	@Override
	public List<Map<String, Object>> getorders_item(String id) {
		// TODO Auto-generated method stub
		List<String> list = getList(id);
		return ordersDao.getorders_item(list);
	}

	@Override
	public List<Map<String, Object>> get_allf002data() {
		// TODO Auto-generated method stub
		return ordersDao.get_allf002data();
	}

	@Override
	public List<Map<String, Object>> getordersitem(String userid) {
		// TODO Auto-generated method stub
		return ordersDao.getordersitem(userid);
	}

	@Override
	public void insert_orders(Orders o) {
		// TODO Auto-generated method stub
		ordersDao.insert_orders(o);
	}

	@Override
	public List<Map<String, Object>> getorderbyoid(String orderid) {
		// TODO Auto-generated method stub
		return ordersDao.getorderbyoid(orderid);
	}

	
	@Override
	public int insertgoodsitem(String sgoodsid, String order_id, String snum, String sFiled, String ssizeclass,
			String sColorid) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				List<OrderItem> list = new ArrayList<>();
				String[] goodsid = sgoodsid.split(",");
				String[] num = snum.split(",");
				String[] Filed = sFiled.split(",");
				String[] sizeclass = ssizeclass.split(",");
				String[] Colorid = sColorid.split(",");
				for(int i=0;i<goodsid.length;i++) {
					OrderItem oi=new OrderItem();
					oi.setGoods_id(goodsid[i]);
					oi.setColorID(Colorid[i]);
					oi.setFiled(Filed[i]);
					oi.setNum(num[i]);
					oi.setOrder_id(order_id);
					oi.setSize_class(sizeclass[i]);
					list.add(oi);
				}
				return ordersDao.insertgoodsitem(list);
	}

	@Override
	public void update_orderstatus(Orders o) {
		// TODO Auto-generated method stub
		ordersDao.update_orderstatus(o);
	}

	@Override
	public List<Orders> get_orderbyid(String orderid) {
		// TODO Auto-generated method stub
		return ordersDao.get_orderbyid(orderid);
	}

	@Override
	public int update_orderkuaidi(Orders o) {
		// TODO Auto-generated method stub
		return ordersDao.update_orderkuaidi(o);
	}

	@Override
	public List<Map<String, Object>> getinstallgoumai(String goods, String filed, String size_class,
			String color_show) {
		// TODO Auto-generated method stub
		return ordersDao.getinstallgoumai(goods, filed, size_class, color_show);
	}

	@Override
	public void update_xiaoliang(String Quantity,String style_id) {
		// TODO Auto-generated method stub
		
		String[] Quantity1 = Quantity.split(",");
		String[] style_id1 = style_id.split(",");
		
		for(int i=0;i<Quantity1.length;i++) {
			goods g = new goods();
			g.setSales_volume(Quantity1[i]);
			g.setStyle_id(style_id1[i]);
			ordersDao.update_xiaoliang(g);
		}
		
		
		
	}

	@Override
	public List<Map<String,Object>> getorderbytype(String type) {
		// TODO Auto-generated method stub
		System.out.println(type);
		return ordersDao.getorderbytype(type);
	}

	@Override
	public void delete_order(String orderId) {
		// TODO Auto-generated method stub
		ordersDao.delete_order(orderId);
		ordersDao.delete_orderdetail(orderId);
		ordersDao.delete_orderdelivery(orderId);
	}

	@Override
	public Order_delivery getaddress(Order_delivery od) {
		// TODO Auto-generated method stub
		return ordersDao.getaddress(od);
	}

	@Override
	public void update_closetime(Orders order) {
		// TODO Auto-generated method stub
		ordersDao.update_closetime(order);
	}

}
