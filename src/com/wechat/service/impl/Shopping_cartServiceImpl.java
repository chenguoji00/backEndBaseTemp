package com.wechat.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wechat.dao.Shopping_cartDao;
import com.wechat.po.Shopping_cart;
import com.wechat.po.goods;
import com.wechat.service.Shopping_cartService;
@Service
@Transactional
public class Shopping_cartServiceImpl implements Shopping_cartService {
	@Autowired
	   private Shopping_cartDao Shopping_cartDao;

	
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
	public List<Map<String,Object>> get_ShoppingCartData(String uid) {
		// TODO Auto-generated method stub
		return Shopping_cartDao.get_ShoppingCartData(uid);
	}
	@Override
	public List<Map<String, Object>> get_ShoppingCartData1(String uid) {
		// TODO Auto-generated method stub
		return Shopping_cartDao.get_ShoppingCartData1(uid);
	}
	
	@Override
	public int insert_shoppingcart(Shopping_cart sc) {
		// TODO Auto-generated method stub
	return 	Shopping_cartDao.insert_shoppingcart(sc);
	}
	@Override
	public Shopping_cart get_ShoppingCartifexist(Shopping_cart sc) {
		// TODO Auto-generated method stub
		return Shopping_cartDao.get_ShoppingCartifexist(sc);
	}
	@Override
	public void update_shoppingcart(Shopping_cart sc) {
		// TODO Auto-generated method stub
		Shopping_cartDao.update_shoppingcart(sc);
	}
	@Override
	public void update_shoppingcartNum(Shopping_cart sc) {
		// TODO Auto-generated method stub
		Shopping_cartDao.update_shoppingcartNum(sc);
	}
	@Override
	public void delete_shopping_cart(String id) {
		// TODO Auto-generated method stub
		Shopping_cartDao.delete_shopping_cart(id);
	}
	@Override
	public void delete_shopping_cart_bylist(String id) {
		// TODO Auto-generated method stub
		List<String> list = getList(id);
	     this.Shopping_cartDao.delete_shopping_cart_bylist(list);
	}

	@Override
	public List<Map<String, Object>> getstockisno(goods g) {
		// TODO Auto-generated method stub
		return Shopping_cartDao.getstockisno(g);
	}

	@Override
	public List<Map<String, Object>> get_shoppingcartData2() {
		// TODO Auto-generated method stub
		return Shopping_cartDao.get_shoppingcartData2();
	}
	
	

}
