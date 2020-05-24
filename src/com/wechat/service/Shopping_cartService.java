package com.wechat.service;

import java.util.List;
import java.util.Map;

import com.wechat.po.Shopping_cart;
import com.wechat.po.goods;

public interface Shopping_cartService {
	public List<Map<String,Object>> get_ShoppingCartData(String uid);
	public List<Map<String,Object>> get_ShoppingCartData1(String uid);
	public int insert_shoppingcart(Shopping_cart sc);
	public Shopping_cart get_ShoppingCartifexist(Shopping_cart sc);
	public void update_shoppingcart(Shopping_cart sc);
	public void update_shoppingcartNum(Shopping_cart sc);
	public void delete_shopping_cart(String id);
	public void delete_shopping_cart_bylist(String paramList);
	public List<Map<String ,Object>> getstockisno(goods g);
	public List<Map<String,Object>> get_shoppingcartData2();
}
