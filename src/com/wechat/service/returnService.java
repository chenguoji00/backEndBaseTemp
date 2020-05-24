package com.wechat.service;

import java.util.List;
import java.util.Map;

import com.wechat.po.B_returnshop;
import com.wechat.po.goods;

public interface returnService {
	public List<Map<String,Object>> getreturnData(B_returnshop b);
	public List<Map<String,Object>> getreturnitem(String orderstatus);
	public List<Map<String,Object>> getminiprogramreturnitem(String userId);
	public int insertreturnitem(B_returnshop b);
	public List<Map<String,Object>> getreturnbystatus(String userId,String status);
	public int updatereturnstatus(B_returnshop b);
	public int updatereturntype(B_returnshop b);
	public int updatereturntype1(B_returnshop b);
	public int updategoodsnum(goods g);
	public int updatef002num(goods g);
	public int delete_returnitem(B_returnshop b);
}
