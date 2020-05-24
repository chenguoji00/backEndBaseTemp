package com.wechat.po;

public class Order_delivery {
	private int id;
	private String orderid;//订单
	private String  userName;//收货人
	private String telNumber;//收货电话
	private String provinceName;//省
	private String cityName;//城市
	private String countyName;//区域
	private String detailInfo;//详细地址
	private String nationalCode;//邮政编码
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCountyName() {
		return countyName;
	}
	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}
	public String getDetailInfo() {
		return detailInfo;
	}
	public void setDetailInfo(String detailInfo) {
		this.detailInfo = detailInfo;
	}
	public String getNationalCode() {
		return nationalCode;
	}
	public void setNationalCode(String nationalCode) {
		this.nationalCode = nationalCode;
	}
	@Override
	public String toString() {
		return "Order_delivery [id=" + id + ", orderid=" + orderid + ", userName=" + userName + ", telNumber="
				+ telNumber + ", provinceName=" + provinceName + ", cityName=" + cityName + ", countyName=" + countyName
				+ ", detailInfo=" + detailInfo + ", nationalCode=" + nationalCode + "]";
	}
	
	
	
}
