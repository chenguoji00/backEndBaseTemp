package com.wechat.po;

public class OrderItem {
	private int id;
	private String goods_id;
	private String order_id;
	private String num;
	private String  Filed;
	private String Size_class;
	
	private String ColorID;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getFiled() {
		return Filed;
	}

	public void setFiled(String filed) {
		Filed = filed;
	}

	public String getSize_class() {
		return Size_class;
	}

	public void setSize_class(String size_class) {
		Size_class = size_class;
	}

	public String getColorID() {
		return ColorID;
	}

	public void setColorID(String colorID) {
		ColorID = colorID;
	}

	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", goods_id=" + goods_id + ", order_id=" + order_id + ", num=" + num + ", Filed="
				+ Filed + ", Size_class=" + Size_class + ", ColorID=" + ColorID + "]";
	}
	
}
