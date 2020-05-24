package com.wechat.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.common.R;
import com.wechat.po.B_category;
import com.wechat.service.categoryService;

@Controller
public class categoryController {
	@Autowired
	private categoryService categoryService;

	// 管理平台查询所有分类表信息
	@RequestMapping({ "/getAllcategory" })
	@ResponseBody
	public R getAllcategory(String classify_word) {
		List<B_category> list = categoryService.getAllcategory(classify_word);
		return R.ok().put("data", list);
	}

	// 小程序类型页面获取数据
	@RequestMapping({ "/get_categorypage" })
	@ResponseBody
	public List<Map<String, Object>> get_categorypage() {
		return categoryService.get_categorypage();
	}

	// 后台管理增加类别信息
	@RequestMapping({ "/insert_category" })
	@ResponseBody
	public void insert_category(B_category b) {
		categoryService.insert_category(b);
	}
	
	//后台管理修改类别update_htcategory
	@RequestMapping({ "/update_htcategory" })
	@ResponseBody
	public int update_htcategory(B_category b) {
		return 	categoryService.update_htcategory(b);
	}
	
	//后台管理批量删除分类表
	@RequestMapping({ "/delete_categoryData" })
	@ResponseBody
	public void delete_categoryData(String id) {
		categoryService.delete_categoryData(id);
	}
	
	
}
