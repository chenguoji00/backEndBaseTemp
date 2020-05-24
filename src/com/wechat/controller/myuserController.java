package com.wechat.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.po.myuser;
import com.wechat.service.myuserService;

@Controller
public class myuserController {
	@Autowired
	private myuserService myuserService;
	
	@RequestMapping({ "/isadmintest" })//查看是否是正确的用户名和密码
	@ResponseBody
	public List<Map<String, Object>> isadmintest(myuser a, HttpServletResponse response, HttpServletRequest request)
			throws ServletException, IOException {
		return myuserService.isadmintest(a);
	}
}
