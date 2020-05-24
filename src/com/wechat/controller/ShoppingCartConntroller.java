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

	// ���ҹ��ﳵ����Ϣ
	@RequestMapping({ "/shoppongcartAllData" })
	@ResponseBody
	public List<Map<String, Object>> shoppongcartAllData(String uid) {
		return this.Shopping_cartService.get_ShoppingCartData(uid);
	}

	// ���ҹ��ﳵ�����м�¼���ں�̨����չʾ
	@RequestMapping({ "/shoppongcartAllData1" })
	@ResponseBody
	public List<Map<String, Object>> shoppongcartAllData1(String uid) {
		return this.Shopping_cartService.get_ShoppingCartData1(uid);
	};

	// ���뵽���ﳵ��
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

	// �������ݿ���Ƿ��������ͬ�������ֶ�
	@RequestMapping({ "/get_ShoppingCartifexist" })
	@ResponseBody
	public Shopping_cart get_ShoppingCartifexist(Shopping_cart sc) {

		return this.Shopping_cartService.get_ShoppingCartifexist(sc);
	}

	// �������ݿ����ݵ�����
	@RequestMapping({ "/update_shoppingcart" })
	@ResponseBody
	public void update_shoppingcart(Shopping_cart sc) {
		this.Shopping_cartService.update_shoppingcart(sc);
	}

	// �������ݿ����ݵ�����
	@RequestMapping({ "/update_shoppingcartNum" })
	@ResponseBody
	public void update_shoppingcartNum(Shopping_cart sc) {
		this.Shopping_cartService.update_shoppingcartNum(sc);
	}

	// ɾ��ĳһ�����ﳵ����
	@RequestMapping({ "/delete_shopping_cart" })
	@ResponseBody
	public void delete_shopping_cart(String id) {
		this.Shopping_cartService.delete_shopping_cart(id);
	}
	
	// ����ɾ�����ﳵ����
		@RequestMapping({ "/delete_shopping_cart_bylist" })
		@ResponseBody
		public void delete_shopping_cart_bylist(String id) {
			this.Shopping_cartService.delete_shopping_cart_bylist(id);
		}
		// �����Ƿ��п��
		@RequestMapping({ "/getstockisno" })
		@ResponseBody
		public List<Map<String ,Object>> getstockisno(goods g) {
			System.out.println(g.getStyle_id());
			return this.Shopping_cartService.getstockisno(g);
		}

		
		
		// ɾ��ĳһ�����ﳵ����
		@RequestMapping({ "/get_shoppingcartData2" })
		@ResponseBody
		public  List<Map<String ,Object>> get_shoppingcartData2() {
			return this.Shopping_cartService.get_shoppingcartData2();
		}
}
