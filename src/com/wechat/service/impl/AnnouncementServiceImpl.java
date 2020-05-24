package com.wechat.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wechat.dao.AnnouncementDao;
import com.wechat.po.Announcement;
import com.wechat.service.AnnouncementService;
@Service
@Transactional
public class AnnouncementServiceImpl implements AnnouncementService {
	@Autowired
	   private AnnouncementDao AnnouncementDao;
	@Override
	public int insertannouncement(Announcement a) {
		// TODO Auto-generated method stub
		return AnnouncementDao.insertannouncement(a);
	}
	@Override
	public List<Map<String, Object>> get_announcement(Announcement a) {
		// TODO Auto-generated method stub
		return AnnouncementDao.get_announcement(a);
	}
	@Override
	public int update_announcementifread(Announcement a) {
		// TODO Auto-generated method stub
		return AnnouncementDao.update_announcementifread(a);
	}

}
