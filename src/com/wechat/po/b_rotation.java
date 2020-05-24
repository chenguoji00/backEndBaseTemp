package com.wechat.po;

public class b_rotation {
	private int id;
	private String url;
	private int status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "b_rotation [id=" + id + ", url=" + url + ", status=" + status + "]";
	}
}
