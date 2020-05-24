package com.wechat.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wechat.dao.categoryDao;
import com.wechat.po.B_category;
import com.wechat.service.categoryService;

@Service
@Transactional
public class categoryServiceImpl implements categoryService{

	@Autowired
	   private categoryDao categoryDao;
	
	
	public List<String> getList(String id) {
		List<String> list = new ArrayList();
		String[] str = id.split(",");
		for (int i = 0; i < str.length; i++) {
			list.add(str[i]);
		}
		return list;
	}
	
	@Override
	public List<B_category> getAllcategory(String classify_word) {
		return categoryDao.getAllcategory(classify_word);
	}
	@Override
	public void insert_category(B_category b) {
		// TODO Auto-generated method stub
		categoryDao.insert_category(b);
	}
	@Override
	public List<Map<String, Object>> get_categorypage() {
		// TODO Auto-generated method stub
		return categoryDao.get_categorypage();
	}
	@Override
	public int update_htcategory(B_category b) {
		// TODO Auto-generated method stub
		return categoryDao.update_htcategory(b);
	}
	@Override
	public void delete_categoryData(String id) {
		// TODO Auto-generated method stub
		List<String> list = getList(id);
		this.categoryDao.delete_categoryData(list);
	}
	
}
