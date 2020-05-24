package com.wechat.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.po.onecomment;
import com.wechat.service.onecommentService;

@Controller
public class onecommentController {
	@Autowired
	private onecommentService onecommentService;
	@RequestMapping({ "/getonecomment" })
	@ResponseBody
	public List<Map<String, Object>> getonecomment(onecomment onecomment) {
		return onecommentService.getonecomment(onecomment);
	}

	@RequestMapping({ "/inonecomment" })
	@ResponseBody
	public int inonecomment(onecomment onecomment) {
		return onecommentService.inonecomment(onecomment);
	}
}
