package com.wechat.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wechat.dao.rotationDao;
import com.wechat.po.b_rotation;
import com.wechat.service.rotationService;
@Service
@Transactional
public class rotationServiceImpl implements rotationService {

	@Autowired
	   private rotationDao rotationDao;
	
	 public List<String> getList(String id)
	   {
	     List<String> list = new ArrayList();
	     String[] str = id.split(",");
	     for (int i = 0; i < str.length; i++) {
	       list.add(str[i]);
	     }
	     return list;
	   }
	
	
	@Override
	public void insert_Rotationpic(b_rotation b) {
		// TODO Auto-generated method stub
		rotationDao.insert_Rotationpic(b);
	}

	@Override
	public List<Map<String, Object>> get_allrotation() {
		// TODO Auto-generated method stub
		return rotationDao.get_allrotation();
	}

	@Override
	public void delete_rotation(String id) {
		System.out.println(id);
		// TODO Auto-generated method stub
		 List<String> list = getList(id);
	     this.rotationDao.delete_rotation(list);
	}


	@Override
	public void update_rotation(b_rotation b) {
		// TODO Auto-generated method stub
		rotationDao.update_rotation(b);
	}


	@Override
	public List<Map<String, Object>> get_allrotation1(String status) {
		// TODO Auto-generated method stub
		return rotationDao.get_allrotation1(status);
	}


	@Override
	public int insert_somerotation(String url,int status) {
		// TODO Auto-generated method stub
		List<b_rotation> list = new ArrayList<>();
		String[] str = url.split(",");
		for(int i=0;i<str.length;i++) {
			b_rotation b=new b_rotation();
			b.setStatus(status);
			b.setUrl(str[i]);
			list.add(b);
		}
		return rotationDao.insert_somerotation(list);
	}


	@Override
	public void delete_kuandetails(String id) {
		// TODO Auto-generated method stub
		 List<String> list = getList(id);
	     this.rotationDao.delete_kuandetails(list);
	}

}
