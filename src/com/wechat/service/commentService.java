package com.wechat.service;

import java.util.List;
import java.util.Map;

import com.wechat.po.comment;

public interface commentService {
	public int insertcomment(comment a);
	public List<Map<String, Object>> get_comment();
}
