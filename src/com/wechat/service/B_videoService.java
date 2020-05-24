package com.wechat.service;

import java.util.List;

import com.wechat.po.B_video;

public interface B_videoService {
	public List<B_video> get_video();
	public int del_video(String id);
	public int insert_video(B_video b);
}
