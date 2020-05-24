package com.wechat.po;

public class B_category {
	private int id;
	private String classify_word;
	private String classify_describe;
	private int ifshow;
	private String id_name;
	
	public String getId_name() {
		return id_name;
	}
	public void setId_name(String id_name) {
		this.id_name = id_name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClassify_word() {
		return classify_word;
	}
	public void setClassify_word(String classify_word) {
		this.classify_word = classify_word;
	}
	public String getClassify_describe() {
		return classify_describe;
	}
	public void setClassify_describe(String classify_describe) {
		this.classify_describe = classify_describe;
	}
	public int getIfshow() {
		return ifshow;
	}
	public void setIfshow(int ifshow) {
		this.ifshow = ifshow;
	}
	@Override
	public String toString() {
		return "B_category [pid=" + id + ", classify_word=" + classify_word + ", classify_describe="
				+ classify_describe + ", ifshow=" + ifshow + "]";
	}
	
	
}
