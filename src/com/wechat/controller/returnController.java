package com.wechat.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.po.B_returnshop;
import com.wechat.po.goods;
import com.wechat.service.returnService;

@Controller
public class returnController {
	@Autowired
	private returnService returnService;

	// 获取退货信息
	@RequestMapping({ "/getreturnData" })
	@ResponseBody
	public List<Map<String, Object>> getreturnData(B_returnshop b) {
		return this.returnService.getreturnData(b);
	}

	// 获取订单成功交易的款明细用于可执行退款功能
	@RequestMapping({ "/getreturnitem" })
	@ResponseBody
	public List<Map<String, Object>> getreturnitem(String orderstatus) {
		System.out.println(orderstatus);
		return this.returnService.getreturnitem(orderstatus);
	}

	// 小程序端获取到可以退款的款明细
	@RequestMapping({ "/getminiprogramreturnitem" })
	@ResponseBody
	public List<Map<String, Object>> getminiprogramreturnitem(String userId) {
		return this.returnService.getminiprogramreturnitem(userId);
	}

	// 小程序提交退貨申請
	@RequestMapping({ "/insertreturnitem" })
	@ResponseBody
	public int insertreturnitem(B_returnshop b) {
		return this.returnService.insertreturnitem(b);
	}

	// 根据退货状态查询
	@RequestMapping({ "/getreturnbystatus" })
	@ResponseBody
	public List<Map<String, Object>> getreturnbystatus(String userId, String status) {
		return this.returnService.getreturnbystatus(userId, status);
	}

	// 修改退货单状态
	@RequestMapping({ "/updatereturnstatus" })
	@ResponseBody
	public int updatereturnstatus(B_returnshop b) {
		return this.returnService.updatereturnstatus(b);
	}

	// 修改退货单的物流信息
	@RequestMapping({ "/updatereturntype" })
	@ResponseBody
	public int updatereturntype(B_returnshop b) {
		return this.returnService.updatereturntype(b);
	}

	// 修改退货单是否发货
	@RequestMapping({ "/updatereturntype1" })
	@ResponseBody
	public int updatereturntype1(B_returnshop b) {
		return this.returnService.updatereturntype1(b);
	}

	// 修改销量
	@RequestMapping({ "/updategoodsnum" })
	@ResponseBody
	public int updategoodsnum(goods g) {
		return this.returnService.updategoodsnum(g);
	}

	// 修改库存
	@RequestMapping({ "/updatef002num" })
	@ResponseBody
	public int updatef002num(goods g) {
		return this.returnService.updatef002num(g);
	}

	// 删除退款单
	@RequestMapping({ "/delete_returnitem" })
	@ResponseBody
	public int delete_returnitem(B_returnshop b) {
		return this.returnService.delete_returnitem(b);
	}
}
