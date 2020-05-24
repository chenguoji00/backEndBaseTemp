package com.wechat.po;

public class Shopping_cart {
	private int id;
	private String u_id;
	private String goods_id;
	private String colorId;
	private String Filed;
	private String size_class;
	private int num;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColorId() {
		return colorId;
	}
	public void setColorId(String colorId) {
		this.colorId = colorId;
	}
	public String getFiled() {
		return Filed;
	}
	public void setFiled(String filed) {
		Filed = filed;
	}
	public String getSize_class() {
		return size_class;
	}
	public void setSize_class(String size_class) {
		this.size_class = size_class;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Shopping_cart [id=" + id + ", u_id=" + u_id + ", goods_id=" + goods_id + ", colorId=" + colorId
				+ ", Filed=" + Filed + ", size_class=" + size_class + ", num=" + num + "]";
	}
}
