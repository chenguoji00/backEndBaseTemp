package com.wechat.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wechat.dao.commentDao;
import com.wechat.po.comment;
import com.wechat.service.commentService;
@Service
@Transactional
public class commentServiceImpl implements commentService {

	@Autowired
	   private commentDao commentDao;
	@Override
	public int insertcomment(comment a) {
		// TODO Auto-generated method stub
		return commentDao.insertcomment(a);
	}
	@Override
	public List<Map<String, Object>> get_comment() {
		// TODO Auto-generated method stub
		return commentDao.get_comment();
	}

}
