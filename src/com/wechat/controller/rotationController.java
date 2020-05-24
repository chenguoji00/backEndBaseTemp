package com.wechat.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.po.b_rotation;
import com.wechat.service.rotationService;

@Controller
public class rotationController {
	@Autowired
	private rotationService rotationService;

	// �������ݵ���ҳ�ֲ�ͼ��
	@RequestMapping({ "/insert_Rotationpic" })
	@ResponseBody
	public void insert_Rotationpic(b_rotation b) {
		System.out.println(b.getUrl());
		System.out.println(b.getStatus());
		this.rotationService.insert_Rotationpic(b);
	}

	// ��ѯ��ҳ�ֲ�ͼ������
	@RequestMapping({ "/get_allrotation1" })
	@ResponseBody
	public List<Map<String, Object>> get_allrotation1(String status) {
		return this.rotationService.get_allrotation1(status);
	}

	// ��ѯ��ҳ�ֲ�ͼ�����ݸ����Ƿ���Ч
	@RequestMapping({ "/get_allrotation" })
	@ResponseBody
	public List<Map<String, Object>> get_allrotation() {
		return this.rotationService.get_allrotation();
	}

	// �h������ֲ�ͼ����
	@RequestMapping({ "/delete_rotation" })
	@ResponseBody
	public void delete_rotation(String id) {
		System.out.println(id);
		rotationService.delete_rotation(id);
	}
	
	// �h��������ͼƬ
		@RequestMapping({ "/delete_kuandetails" })
		@ResponseBody
		public void delete_kuandetails(String id) {
			System.out.println(id);
			rotationService.delete_kuandetails(id);
		}

	// �޸�����ֲ�ͼ����
	@RequestMapping({ "/update_rotation" })
	@ResponseBody
	public void update_rotation(b_rotation b) {
		rotationService.update_rotation(b);
	}

	// ��������ֲ�ͼ����
	@RequestMapping({ "/insert_somerotation" })
	@ResponseBody
	public void insert_somerotation(String url, int status) {
		rotationService.insert_somerotation(url, status);
	}

}
