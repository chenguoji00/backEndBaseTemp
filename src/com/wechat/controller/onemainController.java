package com.wechat.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.po.onemain;
import com.wechat.po.oneuser;
import com.wechat.service.onemainService;
import com.wechat.service.oneuserService;

@Controller
public class onemainController {
	@Autowired
	private onemainService onemainService;
	@RequestMapping({ "/getsomelist" }) //根据类型来获取需要的值1：经历 .2印象，3动漫....
	@ResponseBody
	public List<Map<String, Object>> getsomelist(onemain onemain) {
		return onemainService.getsomelist(onemain);
	}
}
