package com.canteen.canteenms.model;

import java.util.Date;
import java.util.List;

public class orderSelect {
	
	
	private List<Long> foodIdList;
	private Date date;

	public orderSelect() {
		super();
		// TODO Auto-generated constructor stub
	}

	public orderSelect(List<Long> foodIdList, Date date) {
		super();
		this.foodIdList = foodIdList;
		this.date = date;
	}

	public List<Long> getFoodIdList() {
		return foodIdList;
	}

	public void setFoodIdList(List<Long> foodIdList) {
		this.foodIdList = foodIdList;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	

}
