package com.wechat.po;

public class Umanager {
	private int manager_id;
	private String manager_name;
	private String manager_user;
	private String manager_pwd;
	private String manager_url;
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public String getManager_user() {
		return manager_user;
	}
	public void setManager_user(String manager_user) {
		this.manager_user = manager_user;
	}
	public String getManager_pwd() {
		return manager_pwd;
	}
	public void setManager_pwd(String manager_pwd) {
		this.manager_pwd = manager_pwd;
	}
	public String getManager_url() {
		return manager_url;
	}
	public void setManager_url(String manager_url) {
		this.manager_url = manager_url;
	}
	
	public String getManager_name() {
		return manager_name;
	}
	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}
	@Override
	public String toString() {
		return "Umanager [manager_id=" + manager_id + ", manager_name=" + manager_name + ", manager_user="
				+ manager_user + ", manager_pwd=" + manager_pwd + ", manager_url=" + manager_url + "]";
	}
	
	
	
}
