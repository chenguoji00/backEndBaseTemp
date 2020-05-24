package com.wechat.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.po.Announcement;
import com.wechat.po.B_video;
import com.wechat.service.AnnouncementService;
import com.wechat.service.B_videoService;

@Controller
public class AnnouncementController {
	@Autowired
	private AnnouncementService AnnouncementService;

	// 
	@RequestMapping({ "/insertannouncement" })
	@ResponseBody
	public int insertannouncement(Announcement a) {
		return AnnouncementService.insertannouncement(a);
	}

	// 
	@RequestMapping({ "/get_announcement" })
	@ResponseBody
	public List<Map<String, Object>> get_announcement(Announcement a) {
		return AnnouncementService.get_announcement(a);
	}

	// �޸��Ƿ��Ķ�
	@RequestMapping({ "/update_announcementifread" })
	@ResponseBody
	public int update_announcementifread(Announcement a) {
		return AnnouncementService.update_announcementifread(a);
	}

}
