package com.wechat.dao;

import java.util.List;
import java.util.Map;

import com.wechat.po.comment;

public interface commentDao {
	public int insertcomment(comment a);
	public List<Map<String, Object>> get_comment();
}
