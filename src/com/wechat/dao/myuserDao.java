package com.wechat.dao;

import java.util.List;
import java.util.Map;

import com.wechat.po.myuser;

public abstract interface myuserDao {
	public List<Map<String,Object>> isadmintest(myuser a);
}
