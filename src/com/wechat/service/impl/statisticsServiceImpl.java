package com.wechat.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wechat.dao.Shopping_cartDao;
import com.wechat.dao.statisticsDao;
import com.wechat.service.statisticsService;
@Service
@Transactional
public class statisticsServiceImpl implements statisticsService {
	@Autowired
	   private statisticsDao statisticsDao;
	
	@Override
	public List<Map<String, Object>> user_statistics() {
		// TODO Auto-generated method stub
		return statisticsDao.user_statistics();
	}

	@Override
	public List<Map<String, Object>> order_statistics() {
		// TODO Auto-generated method stub
		return statisticsDao.order_statistics();
	}

	@Override
	public List<Map<String, Object>> saletopthree() {
		// TODO Auto-generated method stub
		return statisticsDao.saletopthree();
	}

	@Override
	public List<Map<String, Object>> saleallmoney() {
		// TODO Auto-generated method stub
		return statisticsDao.saleallmoney();
	}

	@Override
	public List<Map<String, Object>> total_purchase() {
		// TODO Auto-generated method stub
		return statisticsDao.total_purchase();
	}
	
	@Override
	public List<Map<String, Object>> usertotal() {
		// TODO Auto-generated method stub
		return statisticsDao.usertotal();
	}

	@Override
	public List<Map<String, Object>> getShopaddress() {
		// TODO Auto-generated method stub
		return statisticsDao.getShopaddress();
	}

	@Override
	public List<Map<String, Object>> gettodayorder() {
		// TODO Auto-generated method stub
		return statisticsDao.gettodayorder();
	}

	@Override
	public List<Map<String, Object>> getorderbetweentime(String time1, String time2) {
		// TODO Auto-generated method stub
		return statisticsDao.getorderbetweentime(time1, time2);
	}

}
