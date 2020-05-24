package com.wechat.po;

public class Announcement {
	private int id;
	private String title;//标题
	private String content;//内容
	private String create_time;//创建时间
	private String user_id;//用户编号
	private int if_read;//是否阅读 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public int getIf_read() {
		return if_read;
	}
	public void setIf_read(int if_read) {
		this.if_read = if_read;
	}
	@Override
	public String toString() {
		return "Announcement [id=" + id + ", title=" + title + ", content=" + content + ", create_time=" + create_time
				+ ", user_id=" + user_id + ", if_read=" + if_read + "]";
	}
	
	
	
}
