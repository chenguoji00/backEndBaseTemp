package com.wechat.service;

import java.util.List;
import java.util.Map;

import com.wechat.po.b_rotation;

public interface rotationService {
	public void insert_Rotationpic(b_rotation b) ;
	public List<Map<String,Object>> get_allrotation();
	public List<Map<String,Object>> get_allrotation1(String status);
	 public abstract void delete_rotation(String id);
	 public void update_rotation(b_rotation b);
	 public void delete_kuandetails(String id);
	 public int insert_somerotation(String url, int status);
}
