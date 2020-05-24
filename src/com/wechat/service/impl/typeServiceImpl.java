package com.wechat.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wechat.dao.typeDao;
import com.wechat.service.typeService;
@Service
@Transactional
public class typeServiceImpl implements typeService {
	@Autowired
	private typeDao typeDao;
	@Override
	public List<Map<String, Object>> gettype(String typeid) {
		// TODO Auto-generated method stub
		return typeDao.gettype(typeid);
	}

}
