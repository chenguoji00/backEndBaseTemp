package com.wechat.dao;

import java.util.List;
import java.util.Map;

import com.wechat.po.Announcement;

public interface AnnouncementDao {
	public int insertannouncement(Announcement a);
	public List<Map<String,Object>> get_announcement(Announcement a);
	public int update_announcementifread(Announcement a);
}
