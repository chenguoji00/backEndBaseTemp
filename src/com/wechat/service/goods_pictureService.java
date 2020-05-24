package com.wechat.service;

import java.util.List;

import com.wechat.po.Goods_picture;

public interface goods_pictureService {
	public List<Goods_picture> getAllGoodsPicture(String goodid);
	public int insertgoodspicture(String url,String style_no,int style);
}
