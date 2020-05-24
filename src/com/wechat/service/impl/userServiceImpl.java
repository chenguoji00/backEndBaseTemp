package com.wechat.service.impl;

import com.wechat.dao.userdao;
import com.wechat.po.user;
import com.wechat.service.userService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class userServiceImpl implements userService {
	@Autowired
	private userdao userdao;

	public List<String> getList(String openids) {
		List<String> list = new ArrayList();
		String[] str = openids.split(",");
		for (int i = 0; i < str.length; i++) {
			list.add(str[i]);
		}
		return list;
	}

	public void add_user(user u) {
		this.userdao.add_user(u);
	}

	public List<user> select_one(String nickName) {
		return this.userdao.select_one(nickName);
	}

	@Override
	public void delete_u_user(String openids) {
		// TODO Auto-generated method stub
		List<String> list = getList(openids);
		this.userdao.delete_u_user(list);
	}

	@Override
	public int update_user(user u) {
		// TODO Auto-generated method stub
		return this.userdao.update_user(u);
	}

	@Override
	public user select_openiduser(user u) {
		// TODO Auto-generated method stub
		return userdao.select_openiduser(u);
	}

	@Override
	public int update_del_user(user u) {
		// TODO Auto-generated method stub
		return userdao.update_del_user(u);
	}

	@Override
	public List<Map<String, Object>> get_malefemaleratio() {
		// TODO Auto-generated method stub
		return userdao.get_malefemaleratio();
	}

	@Override
	public List<Map<String, Object>> get_Differentregions() {
		// TODO Auto-generated method stub
		return userdao.get_Differentregions();
	}

	@Override
	public int update_visit_num(user u) {
		// TODO Auto-generated method stub
		return userdao.update_visit_num(u);
	}

	@Override
	public user haveopenid(String userid) {
		System.out.println(userid);
		// TODO Auto-generated method stub
		return userdao.haveopenid(userid);
	}


}
