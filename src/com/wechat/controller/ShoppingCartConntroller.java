package com.wechat.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.common.R;
import com.wechat.po.Shopping_cart;
import com.wechat.po.goods;
import com.wechat.service.Shopping_cartService;

@Controller

public class ShoppingCartConntroller {
	@Autowired
	private Shopping_cartService Shopping_cartService;

	// 查找购物车表信息
	@RequestMapping({ "/shoppongcartAllData" })
	@ResponseBody
	public List<Map<String, Object>> shoppongcartAllData(String uid) {
		return this.Shopping_cartService.get_ShoppingCartData(uid);
	}

	// 查找购物车表所有记录用于后台界面展示
	@RequestMapping({ "/shoppongcartAllData1" })
	@ResponseBody
	public List<Map<String, Object>> shoppongcartAllData1(String uid) {
		return this.Shopping_cartService.get_ShoppingCartData1(uid);
	};

	// 插入到购物车表
	@RequestMapping({ "/insert_Shoppingcart" })
	@ResponseBody
	public R insert_Shoppingcart(Shopping_cart sc) {
		
		
		
	int a=	this.Shopping_cartService.insert_shoppingcart(sc);
	System.out.println(a);
		if(a==0) {
			return R.error();
		}else {
			return R.ok().put("data", a);
		}
	}

	// 查找数据库表是否存在有想同的数据字段
	@RequestMapping({ "/get_ShoppingCartifexist" })
	@ResponseBody
	public Shopping_cart get_ShoppingCartifexist(Shopping_cart sc) {

		return this.Shopping_cartService.get_ShoppingCartifexist(sc);
	}

	// 更新数据库数据的数量
	@RequestMapping({ "/update_shoppingcart" })
	@ResponseBody
	public void update_shoppingcart(Shopping_cart sc) {
		this.Shopping_cartService.update_shoppingcart(sc);
	}

	// 更新数据库数据的数量
	@RequestMapping({ "/update_shoppingcartNum" })
	@ResponseBody
	public void update_shoppingcartNum(Shopping_cart sc) {
		this.Shopping_cartService.update_shoppingcartNum(sc);
	}

	// 删除某一条购物车数据
	@RequestMapping({ "/delete_shopping_cart" })
	@ResponseBody
	public void delete_shopping_cart(String id) {
		this.Shopping_cartService.delete_shopping_cart(id);
	}
	
	// 批量删除购物车数据
		@RequestMapping({ "/delete_shopping_cart_bylist" })
		@ResponseBody
		public void delete_shopping_cart_bylist(String id) {
			this.Shopping_cartService.delete_shopping_cart_bylist(id);
		}
		// 查找是否还有库存
		@RequestMapping({ "/getstockisno" })
		@ResponseBody
		public List<Map<String ,Object>> getstockisno(goods g) {
			System.out.println(g.getStyle_id());
			return this.Shopping_cartService.getstockisno(g);
		}

		
		
		// 删除某一条购物车数据
		@RequestMapping({ "/get_shoppingcartData2" })
		@ResponseBody
		public  List<Map<String ,Object>> get_shoppingcartData2() {
			return this.Shopping_cartService.get_shoppingcartData2();
		}
}
