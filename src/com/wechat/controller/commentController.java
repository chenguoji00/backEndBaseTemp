package com.wechat.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.po.comment;
import com.wechat.service.commentService;

@Controller
public class commentController {
	@Autowired
	private commentService commentService;
	//插入评论，传入的是评论的基本类型
	@RequestMapping({ "/insertcomment" }) 
	@ResponseBody
	public int insertannouncement(comment a) {
		System.out.println(a.getContent());
		return commentService.insertcomment(a);
	}
	//获取评论内容
	@RequestMapping({ "/get_comment" })
	@ResponseBody
	public List<Map<String, Object>> get_comment() {
		return commentService.get_comment();
	}

}
