package com.wechat.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.po.B_video;
import com.wechat.service.B_videoService;
import com.wechat.service.categoryService;

@Controller
public class B_videoController {
	@Autowired
	private B_videoService B_videoService;

	// ��̨��ҳ��ʾ��ȡ��Ƶ��ַ��Ϣ
	@RequestMapping({ "/get_video" })
	@ResponseBody
	public List<Map<String, Object>> get_video() {
			
		   List<Map<String, Object>> listMaps = new ArrayList<Map<String, Object>>();

	        
	        Map<String, Object> map2 = new HashMap<String, Object>();
	        map2.put("cgj", B_videoService.get_video());
	        listMaps.add(map2);
	        
	        System.out.println(listMaps);
	        
	        for (Map<String, Object> map : listMaps) {
	            for (Map.Entry<String, Object> m : map.entrySet()) {
	                System.out.print(m.getKey() + "    ");
	                System.out.println(m.getValue());
	            }
	        }
	        System.out.println("-----------------------------");
	        
		return listMaps;
	}

	// ��̨ɾ����ҳ��Ƶ
	@RequestMapping({ "/del_video" })
	@ResponseBody
	public int del_video(String id) {
		return B_videoService.del_video(id);
	}
	
	// ��̨������Ƶ����
	@RequestMapping({ "/insert_video" })
	@ResponseBody
	public int insert_video(B_video b) {
		return B_videoService.insert_video(b);
	}

}
