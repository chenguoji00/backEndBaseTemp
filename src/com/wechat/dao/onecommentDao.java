package com.wechat.dao;

import java.util.List;
import java.util.Map;

import com.wechat.po.comment;
import com.wechat.po.onecomment;

public interface onecommentDao {
	public List<Map<String,Object>> getonecomment(onecomment	onecomment);
	public int inonecomment(onecomment onecomment);
}
