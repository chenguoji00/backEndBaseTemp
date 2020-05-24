package com.wechat.po;

import java.util.Date;

public class Orders {
	private int id;
	private String orderId;
	private String userId;
	private Double totalmoney;
	private int orderstatus;
	private String create_time;
	private String close_time;
	private String express_company;
	private String short_express_company;
	
	public String getExpress_company() {
		return express_company;
	}
	public void setExpress_company(String express_company) {
		this.express_company = express_company;
	}
	public String getShort_express_company() {
		return short_express_company;
	}
	public void setShort_express_company(String short_express_company) {
		this.short_express_company = short_express_company;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Double getTotalmoney() {
		return totalmoney;
	}
	public void setTotalmoney(Double totalmoney) {
		this.totalmoney = totalmoney;
	}
	public int getOrderstatus() {
		return orderstatus;
	}
	public void setOrderstatus(int orderstatus) {
		this.orderstatus = orderstatus;
	}

	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getClose_time() {
		return close_time;
	}
	public void setClose_time(String close_time) {
		this.close_time = close_time;
	}
	public String getLogistics_code() {
		return logistics_code;
	}
	public void setLogistics_code(String logistics_code) {
		this.logistics_code = logistics_code;
	}
	private String logistics_code;
	@Override
	public String toString() {
		return "Orders [id=" + id + ", orderId=" + orderId + ", userId=" + userId + ", totalmoney=" + totalmoney
				+ ", orderstatus=" + orderstatus + ", end_time=" + create_time + ", close_time=" + close_time
				+ ", logistics_code=" + logistics_code + "]";
	}
	
}
