package com.wechat.dao;

import java.util.List;

import com.wechat.po.Goods_picture;

public interface goods_pictureDao {
	public List<Goods_picture> getAllGoodsPicture(String goodid);
	public int insertgoodspicture(List<Goods_picture> list );
}
