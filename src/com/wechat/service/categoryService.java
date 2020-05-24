package com.wechat.service;

import java.util.List;
import java.util.Map;

import com.wechat.po.B_category;

public interface categoryService {
	public List<B_category> getAllcategory(String classify_word);
	public void insert_category(B_category b);
	public List<Map<String, Object>> get_categorypage();
	public int update_htcategory(B_category b);
	public void delete_categoryData(String paramString);
}
