package com.wechat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.po.Goods_picture;
import com.wechat.po.user;
import com.wechat.service.goods_pictureService;

@Controller
public class goods_pictureController {
	
	 @Autowired
	   private goods_pictureService goods_pictureService;
	 
	 //查询所有款号的所有图片（轮播图和详细图）
	   @RequestMapping({"/getAllGoodsPicture"})
	   @ResponseBody
	   public List<Goods_picture> getAllGoodsPicture(String goodid) {
		   return goods_pictureService.getAllGoodsPicture(goodid);
		}
	 
	   @RequestMapping({"/insertgoodspicture"})
	   @ResponseBody
	   public int insertgoodspicture(String url, String style_no, int style) {
		   return goods_pictureService.insertgoodspicture(url, style_no, style);
		}
	 
	   
}
