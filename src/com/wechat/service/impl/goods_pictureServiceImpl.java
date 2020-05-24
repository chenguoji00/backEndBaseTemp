package com.wechat.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wechat.dao.goods_pictureDao;
import com.wechat.po.Goods_picture;
import com.wechat.po.b_rotation;
import com.wechat.service.goods_pictureService;
@Service
@Transactional
public class goods_pictureServiceImpl implements goods_pictureService {

	@Autowired
	private goods_pictureDao goods_pictureDao;
	
	
	
	
	@Override
	public List<Goods_picture> getAllGoodsPicture(String goodid) {
		// TODO Auto-generated method stub
		return goods_pictureDao.getAllGoodsPicture(goodid);
	}

	@Override
	public int insertgoodspicture(String url, String style_no, int style) {
		// TODO Auto-generated method stub
		List<Goods_picture> list = new ArrayList<>();
		
		String[] str = url.split(",");
		for(int i=0;i<str.length;i++) {
			Goods_picture gp=new Goods_picture();
			gp.setUrl(str[i]);
			gp.setStyle(style);
			gp.setStyle_no(style_no);
			list.add(gp);
		}
		return goods_pictureDao.insertgoodspicture(list);
	}

}
