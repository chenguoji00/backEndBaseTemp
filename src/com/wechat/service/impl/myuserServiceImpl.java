package com.wechat.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wechat.dao.myuserDao;
import com.wechat.po.myuser;
import com.wechat.service.myuserService;
@Service
@Transactional
public class myuserServiceImpl implements myuserService {
	@Autowired
	   private myuserDao myuserDao;
	
	@Override
	public List<Map<String, Object>> isadmintest(myuser a) {
		// TODO Auto-generated method stub
		return myuserDao.isadmintest(a);
	}

}
