package com.wechat.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wechat.dao.gjtestDao;
import com.wechat.po.gjtest;
import com.wechat.service.gjtestService;
@Service
@Transactional
public class gjtestServiceImpl implements gjtestService {
	@Autowired
	   private gjtestDao gjtestDao;
	@Override
	public List<Map<String, Object>> getgjtest(gjtest a) {
		// TODO Auto-generated method stub
		return gjtestDao.getgjtest(a);
	}

}
