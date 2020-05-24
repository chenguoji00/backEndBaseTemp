package com.wechat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wechat.dao.B_videoDao;
import com.wechat.dao.basicGoodsDao;
import com.wechat.po.B_video;
import com.wechat.service.B_videoService;

@Service
@Transactional
public class B_videoServiceImpl  implements B_videoService{

	@Autowired
	   private B_videoDao B_videoDao;
	@Override
	public List<B_video> get_video() {
		// TODO Auto-generated method stub
		return B_videoDao.get_video();
	}
	
	@Override
	public int del_video(String id) {
		// TODO Auto-generated method stub
		return B_videoDao.del_video(id);
	}

	@Override
	public int insert_video(B_video b) {
		// TODO Auto-generated method stub
		return B_videoDao.insert_video(b);
	}
	
}
