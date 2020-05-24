package com.wechat.po;

public class Goods_picture {
	//¿îÍ¼Æ¬ÏêÇé±í
	private int pic_key;
	private String style_no;
	private String url;
	private int style;
	public int getPic_key() {
		return pic_key;
	}
	public void setPic_key(int pic_key) {
		this.pic_key = pic_key;
	}
	public String getStyle_no() {
		return style_no;
	}
	public void setStyle_no(String style_no) {
		this.style_no = style_no;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getStyle() {
		return style;
	}
	public void setStyle(int style) {
		this.style = style;
	}
	@Override
	public String toString() {
		return "Goods_picture [pic_key=" + pic_key + ", style_no=" + style_no + ", url=" + url + ", style=" + style
				+ "]";
	}
	
}
