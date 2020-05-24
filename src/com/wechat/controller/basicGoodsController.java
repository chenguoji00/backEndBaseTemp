package com.wechat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.po.goods;
import com.wechat.service.basicGoodsService;

@Controller
public class basicGoodsController {
	@Autowired
	private basicGoodsService basicGoodsService;
	
	//ɾ����������Ϣ
	@RequestMapping({ "/delete_b_goods" })
	@ResponseBody
	public void delete_b_goods(String id) {
		basicGoodsService.delete_b_goods(id);

	}

	//��ȡ���л�������Ϣ
	@RequestMapping({ "/get_somegoods" })
	@ResponseBody
	public List get_somegoods(String goodlabel) {
		return this.basicGoodsService.get_somegoods(goodlabel);
	}

	//�޸Ļ�������Ϣ
	@RequestMapping({ "/update_basicgoods" })
	@ResponseBody
	public void update_basicgoods(goods g) {
		this.basicGoodsService.update_basicgoods(g);
	}
}