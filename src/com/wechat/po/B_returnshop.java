package com.wechat.po;

public class B_returnshop {
	private String return_id;
	private String orderdetailid;
	private String orderId;
	private String userId;
	private int status;
	private String return_detail;
	private String return_reason;
	private String order_time;
	private String logistics_code;
	private String express_company;
	private String short_express_company;
	private String return_type;
	
	public String getReturn_type() {
		return return_type;
	}
	public void setReturn_type(String return_type) {
		this.return_type = return_type;
	}
	public String getLogistics_code() {
		return logistics_code;
	}
	public void setLogistics_code(String logistics_code) {
		this.logistics_code = logistics_code;
	}
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
	public String getOrderdetailid() {
		return orderdetailid;
	}
	public void setOrderdetailid(String orderdetailid) {
		this.orderdetailid = orderdetailid;
	}
	public String getReturn_detail() {
		return return_detail;
	}
	public void setReturn_detail(String return_detail) {
		this.return_detail = return_detail;
	}
	public String getReturn_reason() {
		return return_reason;
	}
	public void setReturn_reason(String return_reason) {
		this.return_reason = return_reason;
	}
	public String getOrder_time() {
		return order_time;
	}
	public void setOrder_time(String order_time) {
		this.order_time = order_time;
	}
	public String getReturn_id() {
		return return_id;
	}
	public void setReturn_id(String return_id) {
		this.return_id = return_id;
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
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "B_returnshop [return_id=" + return_id + ", orderdetailid=" + orderdetailid + ", orderId=" + orderId
				+ ", userId=" + userId + ", status=" + status + ", return_detail=" + return_detail + ", return_reason="
				+ return_reason + ", order_time=" + order_time + ", logistics_code=" + logistics_code
				+ ", express_company=" + express_company + ", short_express_company=" + short_express_company
				+ ", return_type=" + return_type + "]";
	}
	
	
	
	
}
