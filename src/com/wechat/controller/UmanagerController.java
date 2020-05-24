package com.wechat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.po.Umanager;
import com.wechat.service.UmanagerService;

@Controller
public class UmanagerController {
	 @Autowired
	   private UmanagerService UmanagerService;
	 
	 //查询管理员表是否有需要查询的账号和密码，有就进入系统，没有就显示密码或者账号错误
	 @RequestMapping({"/get_manager_user"})
	   @ResponseBody
	   public Umanager get_manager_user(Umanager u)
	   {
	     return this.UmanagerService.get_manager_user(u);
	   }
	 
	 
}
