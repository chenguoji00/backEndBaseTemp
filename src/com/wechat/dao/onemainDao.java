package com.wechat.dao;

import java.util.List;
import java.util.Map;

import com.wechat.po.onemain;

public interface onemainDao {
	public List<Map<String,Object>> getsomelist(onemain onemain);
}
