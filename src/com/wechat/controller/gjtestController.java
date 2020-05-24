package com.wechat.controller;

import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.po.gjtest;
import com.wechat.po.user;
import com.wechat.service.AnnouncementService;
import com.wechat.service.gjtestService;

@Controller
public class gjtestController {
	@Autowired
	private gjtestService gjtestService;
	// 查询通知表信息根据通知的用户编号和通知是否已读未读来查询
		@RequestMapping({ "/getgjtest" })
		@ResponseBody
		public List<Map<String, Object>> getgjtest(gjtest a, HttpServletResponse response, HttpServletRequest request)
				throws ServletException, IOException {
			response.setContentType("text/json;charset=UTF-8");
			response.setContentType("text/html;charset=utf-8");

			response.setHeader("Access-Control-Allow-Origin", "*");

			response.setHeader("Access-Control-Allow-Methods", "GET,POST");
			System.out.print(a+"我是gjtest类的controller");
			return gjtestService.getgjtest(a);
		}
}
