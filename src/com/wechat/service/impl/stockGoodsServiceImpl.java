package com.wechat.service.impl;

import com.wechat.dao.stockGoodsDao;
import com.wechat.po.b_color;
import com.wechat.po.b_rotation;
import com.wechat.po.goods;
import com.wechat.service.stockGoodsService;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class stockGoodsServiceImpl implements stockGoodsService {
	@Autowired
	private stockGoodsDao stockGoodsDao;

	public List<String> getList(String id) {
		List<String> list = new ArrayList();
		String[] str = id.split(",");
		for (int i = 0; i < str.length; i++) {
			list.add(str[i]);
		}
		return list;
	}

	public List<goods> get_stock_data(String goodsLabel) {
		return this.stockGoodsDao.get_stock_data(goodsLabel);
	}

	public List<b_color> get_colorData() {
		return this.stockGoodsDao.get_colorData();
	}

	public void insert_stock(goods g) {
		this.stockGoodsDao.insert_stock(g);
	}

	@Override
	public void update_stock(goods paramgoods) {
		// TODO Auto-generated method stub
		this.stockGoodsDao.update_stock(paramgoods);
	}

	@Override
	public void delete_f002Data(String id) {
		// TODO Auto-generated method stub
		List<String> list = getList(id);
		this.stockGoodsDao.delete_f002Data(list);
	}

	@Override
	public void update_f002qua(String quatity,String goodsid,String fileds,String size_classs,String colorid) {
		// TODO Auto-generated method stub
		List<goods> list = new ArrayList<>();
		String[] quatitys = quatity.split(",");
		String[] goodidss = goodsid.split(",");
		String[] filedsa = fileds.split(",");
		String[] size_classsa = size_classs.split(",");
		String[] colorida = colorid.split(",");
		for (int i = 0; i < quatitys.length; i++) {
			stockGoodsDao.update_f002qua(quatitys[i], goodidss[i],filedsa[i],size_classsa[i],colorida[i]);
		}
	}
	
	@Override
	public void update_f002quajia(String quatity,String goodsid,String colorid, String Filed) {
		// TODO Auto-generated method stub
		List<goods> list = new ArrayList<>();
		String[] quatitys = quatity.split(",");
		String[] goodidss = goodsid.split(",");
		String[] colorids=colorid.split(",");
		String[] Fileds=Filed.split(",");
		for (int i = 0; i < quatitys.length; i++) {
			stockGoodsDao.update_f002quajia(quatitys[i], goodidss[i],colorids[i],Fileds[i]);
		}
	}

}
