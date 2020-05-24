package com.wechat.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.service.typeService;

@Controller
public class typeController {
	@Autowired
	private typeService typeService;
	
	@RequestMapping({ "/gettype" })
	@ResponseBody
	public List<Map<String, Object>> gettype(String typeid) {
		return this.typeService.gettype(typeid);
	}

}
