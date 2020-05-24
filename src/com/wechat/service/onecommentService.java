package com.wechat.service;

import java.util.List;
import java.util.Map;

import com.wechat.po.onecomment;

public interface onecommentService {
	public List<Map<String,Object>> getonecomment(onecomment	onecomment);
	public int inonecomment(onecomment onecomment);
}
