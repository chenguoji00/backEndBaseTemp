package com.wechat.dao;

import java.util.List;
import java.util.Map;

import com.wechat.po.b_rotation;

public interface rotationDao {
	public void insert_Rotationpic(b_rotation b);

	public List<Map<String, Object>> get_allrotation();

	public List<Map<String, Object>> get_allrotation1(String status);

	public abstract void delete_rotation(List<String> id);

	public void update_rotation(b_rotation b);

	public int insert_somerotation(List<b_rotation> list);
	
	public void delete_kuandetails(List<String> id);
}
