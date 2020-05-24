package com.wechat.service;

import java.util.List;
import java.util.Map;

import com.wechat.po.user;

public abstract interface userService
{
  public abstract void add_user(user paramuser);

  
  public  List<user> select_one(String nickName);
  
  public void delete_u_user(String openids);
  
  public int update_user(user u);
  public int  update_del_user(user u);
  
  public user select_openiduser(user u);
  public List<Map<String,Object>>  get_malefemaleratio();
  public List<Map<String,Object>>  get_Differentregions();
  public int update_visit_num(user u);
  public user haveopenid(String userid);
}


/* Location:           C:\Users\陈国基\Desktop\java_api_wechat.zip
 * Qualified Name:     WEB-INF.classes.com.wechat.service.userService
 * JD-Core Version:    0.7.0.1
 */