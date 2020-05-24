package com.wechat.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.po.oneuser;
import com.wechat.service.oneuserService;

@Controller
public class oneuserController {
	@Autowired
	private oneuserService oneuserService;
	@RequestMapping({ "/getoneuser" })//传入到用户中
	@ResponseBody
	public List<Map<String, Object>> getoneuser(oneuser oneuser) {
		return oneuserService.getoneuser(oneuser);
	}
}
