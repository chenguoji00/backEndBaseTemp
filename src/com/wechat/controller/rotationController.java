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

	// 插入数据到主页轮播图表
	@RequestMapping({ "/insert_Rotationpic" })
	@ResponseBody
	public void insert_Rotationpic(b_rotation b) {
		System.out.println(b.getUrl());
		System.out.println(b.getStatus());
		this.rotationService.insert_Rotationpic(b);
	}

	// 查询主页轮播图表数据
	@RequestMapping({ "/get_allrotation1" })
	@ResponseBody
	public List<Map<String, Object>> get_allrotation1(String status) {
		return this.rotationService.get_allrotation1(status);
	}

	// 查询主页轮播图表数据根据是否有效
	@RequestMapping({ "/get_allrotation" })
	@ResponseBody
	public List<Map<String, Object>> get_allrotation() {
		return this.rotationService.get_allrotation();
	}

	// 刪除主頁轮播图数据
	@RequestMapping({ "/delete_rotation" })
	@ResponseBody
	public void delete_rotation(String id) {
		System.out.println(id);
		rotationService.delete_rotation(id);
	}
	
	// 刪除款详情图片
		@RequestMapping({ "/delete_kuandetails" })
		@ResponseBody
		public void delete_kuandetails(String id) {
			System.out.println(id);
			rotationService.delete_kuandetails(id);
		}

	// 修改主頁轮播图数据
	@RequestMapping({ "/update_rotation" })
	@ResponseBody
	public void update_rotation(b_rotation b) {
		rotationService.update_rotation(b);
	}

	// 插入主頁轮播图数据
	@RequestMapping({ "/insert_somerotation" })
	@ResponseBody
	public void insert_somerotation(String url, int status) {
		rotationService.insert_somerotation(url, status);
	}

}
