package com.wechat.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wechat.dao.myuserDao;
import com.wechat.dao.oneuserDao;
import com.wechat.po.oneuser;
import com.wechat.service.oneuserService;
@Service
@Transactional
public class oneuserServiceImpl implements oneuserService {
	@Autowired
	   private oneuserDao oneuserDao;
	@Override
	public List<Map<String, Object>> getoneuser(oneuser oneuser) {
		// TODO Auto-generated method stub
		return oneuserDao.getoneuser(oneuser);
	}

}
