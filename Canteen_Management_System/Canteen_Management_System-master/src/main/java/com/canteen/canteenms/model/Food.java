package com.canteen.canteenms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Food {

	@Id
	private long foodId;
	private String foodName;
	private String meal;
	private String foodType;
	private String month;
	private int year;
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Food(long foodId, String foodName, String meal, String foodType, String month, int year) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.meal = meal;
		this.foodType = foodType;
		this.month = month;
		this.year = year;
	}
	public long getFoodId() {
		return foodId;
	}
	public void setFoodId(long foodId) {
		this.foodId = foodId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getMeal() {
		return meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
	
}
