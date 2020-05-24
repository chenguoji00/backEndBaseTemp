package com.wechat.dao;

import java.util.List;
import java.util.Map;

import com.wechat.po.user;

public abstract interface userdao
{
  public abstract void add_user(user paramuser);
  
  public  List<user> select_one(String nickName);
  public void delete_u_user(List<String> openids);
  public int  update_user(user u);
  public int  update_del_user(user u);
  public user select_openiduser(user u);
  public List<Map<String,Object>>  get_malefemaleratio();
  public List<Map<String,Object>> get_Differentregions();
  public int update_visit_num(user u);
  public user haveopenid(String userid);
}

