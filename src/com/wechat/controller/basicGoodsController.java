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
	
	//删除基础表信息
	@RequestMapping({ "/delete_b_goods" })
	@ResponseBody
	public void delete_b_goods(String id) {
		basicGoodsService.delete_b_goods(id);

	}

	//获取所有基础表信息
	@RequestMapping({ "/get_somegoods" })
	@ResponseBody
	public List get_somegoods(String goodlabel) {
		return this.basicGoodsService.get_somegoods(goodlabel);
	}

	//修改基础表信息
	@RequestMapping({ "/update_basicgoods" })
	@ResponseBody
	public void update_basicgoods(goods g) {
		this.basicGoodsService.update_basicgoods(g);
	}
}