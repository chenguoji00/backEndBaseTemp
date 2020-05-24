package com.wechat.po;

public class B_video {
	private int id;
	private String url;
	private String topic;
	private String english_word;
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
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getEnglish_word() {
		return english_word;
	}
	public void setEnglish_word(String english_word) {
		this.english_word = english_word;
	}
	@Override
	public String toString() {
		return "B_video [id=" + id + ", url=" + url + ", topic=" + topic + ", english_word=" + english_word + "]";
	}
	
}
