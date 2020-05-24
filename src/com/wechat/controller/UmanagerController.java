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
	 
	 //��ѯ����Ա���Ƿ�����Ҫ��ѯ���˺ź����룬�оͽ���ϵͳ��û�о���ʾ��������˺Ŵ���
	 @RequestMapping({"/get_manager_user"})
	   @ResponseBody
	   public Umanager get_manager_user(Umanager u)
	   {
	     return this.UmanagerService.get_manager_user(u);
	   }
	 
	 
}
