package com.wechat.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wechat.dao.onecommentDao;
import com.wechat.po.onecomment;
import com.wechat.service.onecommentService;
@Service
@Transactional
public class onecommentServiceImpl implements onecommentService {
	@Autowired
	   private onecommentDao onecommentDao;
	@Override
	public List<Map<String, Object>> getonecomment(onecomment onecomment) {
		// TODO Auto-generated method stub
		return onecommentDao.getonecomment(onecomment);
	}
	@Override
	public int inonecomment(onecomment onecomment) {
		// TODO Auto-generated method stub
		return onecommentDao.inonecomment(onecomment);
	}

}
