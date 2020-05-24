package com.wechat.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wechat.dao.onemainDao;
import com.wechat.po.onemain;
import com.wechat.service.onemainService;
@Service
@Transactional
public class onmainServiceImpl implements onemainService {
	@Autowired
	   private onemainDao onemainDao;
	
	@Override
	public List<Map<String, Object>> getsomelist(onemain onemain) {
		// TODO Auto-generated method stub
		return onemainDao.getsomelist(onemain);
	}

}
