package com.wechat.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wechat.dao.returnDao;
import com.wechat.po.B_returnshop;
import com.wechat.po.goods;
import com.wechat.service.returnService;

@Service
@Transactional
public class returnServiceImpl implements returnService {
	@Autowired
	private returnDao returnDao;

	@Override
	public List<Map<String, Object>> getreturnData(B_returnshop b) {
		// TODO Auto-generated method stub
		return returnDao.getreturnData(b);
	}

	@Override
	public List<Map<String, Object>> getreturnitem(String orderstatus) {
		// TODO Auto-generated method stub
		return returnDao.getreturnitem(orderstatus);
	}

	@Override
	public List<Map<String, Object>> getminiprogramreturnitem(String userId) {
		// TODO Auto-generated method stub
		return returnDao.getminiprogramreturnitem(userId);
	}

	@Override
	public int insertreturnitem(B_returnshop b) {
		// TODO Auto-generated method stub
		return returnDao.insertreturnitem(b);
	}

	@Override
	public List<Map<String, Object>> getreturnbystatus(String userId, String status) {
		// TODO Auto-generated method stub
		return returnDao.getreturnbystatus(userId, status);
	}

	@Override
	public int updatereturnstatus(B_returnshop b) {
		// TODO Auto-generated method stub
		return returnDao.updatereturnstatus(b);
	}

	@Override
	public int updatereturntype(B_returnshop b) {
		// TODO Auto-generated method stub
		return returnDao.updatereturntype(b);
	}

	@Override
	public int updatereturntype1(B_returnshop b) {
		// TODO Auto-generated method stub
		return returnDao.updatereturntype1(b);
	}

	@Override
	public int updategoodsnum(goods g) {
		// TODO Auto-generated method stub
		return returnDao.updategoodsnum(g);
	}

	@Override
	public int updatef002num(goods g) {
		// TODO Auto-generated method stub
		return returnDao.updatef002num(g);
	}

	@Override
	public int delete_returnitem(B_returnshop b) {
		// TODO Auto-generated method stub
		return returnDao.delete_returnitem(b);
	}

}
