package com.canteen.canteenms.model;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrderList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderId;
	private int userId;
	@Column(nullable = false)
	private int foodId;
	private Date savedate;
	public OrderList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderList(long orderId, int userId, int foodId, Date date) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.foodId = foodId;
		this.savedate = date;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public Date getDate() {
		return savedate;
	}
	public void setDate(Date date) {
		this.savedate = date;
	}
	

}
