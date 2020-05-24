package com.wechat.dao;

import java.util.List;
import java.util.Map;

import com.wechat.po.oneuser;

public interface oneuserDao {
	public List<Map<String,Object>> getoneuser(oneuser oneuser);
}
