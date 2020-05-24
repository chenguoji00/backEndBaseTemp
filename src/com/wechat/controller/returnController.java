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

	// ��ȡ�˻���Ϣ
	@RequestMapping({ "/getreturnData" })
	@ResponseBody
	public List<Map<String, Object>> getreturnData(B_returnshop b) {
		return this.returnService.getreturnData(b);
	}

	// ��ȡ�����ɹ����׵Ŀ���ϸ���ڿ�ִ���˿��
	@RequestMapping({ "/getreturnitem" })
	@ResponseBody
	public List<Map<String, Object>> getreturnitem(String orderstatus) {
		System.out.println(orderstatus);
		return this.returnService.getreturnitem(orderstatus);
	}

	// С����˻�ȡ�������˿�Ŀ���ϸ
	@RequestMapping({ "/getminiprogramreturnitem" })
	@ResponseBody
	public List<Map<String, Object>> getminiprogramreturnitem(String userId) {
		return this.returnService.getminiprogramreturnitem(userId);
	}

	// С�����ύ��؛��Ո
	@RequestMapping({ "/insertreturnitem" })
	@ResponseBody
	public int insertreturnitem(B_returnshop b) {
		return this.returnService.insertreturnitem(b);
	}

	// �����˻�״̬��ѯ
	@RequestMapping({ "/getreturnbystatus" })
	@ResponseBody
	public List<Map<String, Object>> getreturnbystatus(String userId, String status) {
		return this.returnService.getreturnbystatus(userId, status);
	}

	// �޸��˻���״̬
	@RequestMapping({ "/updatereturnstatus" })
	@ResponseBody
	public int updatereturnstatus(B_returnshop b) {
		return this.returnService.updatereturnstatus(b);
	}

	// �޸��˻�����������Ϣ
	@RequestMapping({ "/updatereturntype" })
	@ResponseBody
	public int updatereturntype(B_returnshop b) {
		return this.returnService.updatereturntype(b);
	}

	// �޸��˻����Ƿ񷢻�
	@RequestMapping({ "/updatereturntype1" })
	@ResponseBody
	public int updatereturntype1(B_returnshop b) {
		return this.returnService.updatereturntype1(b);
	}

	// �޸�����
	@RequestMapping({ "/updategoodsnum" })
	@ResponseBody
	public int updategoodsnum(goods g) {
		return this.returnService.updategoodsnum(g);
	}

	// �޸Ŀ��
	@RequestMapping({ "/updatef002num" })
	@ResponseBody
	public int updatef002num(goods g) {
		return this.returnService.updatef002num(g);
	}

	// ɾ���˿
	@RequestMapping({ "/delete_returnitem" })
	@ResponseBody
	public int delete_returnitem(B_returnshop b) {
		return this.returnService.delete_returnitem(b);
	}
}
