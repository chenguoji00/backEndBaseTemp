package com.wechat.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wechat.dao.UmanagerDao;
import com.wechat.po.Umanager;
import com.wechat.service.UmanagerService;
@Service
@Transactional
public class UmanagerServiceImpl implements UmanagerService {
	@Autowired
	   private UmanagerDao UmanagerDao;
	@Override
	public Umanager get_manager_user(Umanager u) {
		// TODO Auto-generated method stub
		return UmanagerDao.get_manager_user(u);
	}

}
