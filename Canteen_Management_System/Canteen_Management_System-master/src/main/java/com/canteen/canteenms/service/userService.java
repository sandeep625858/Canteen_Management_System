package com.canteen.canteenms.service;

import java.util.Date;
import java.util.List;

import com.canteen.canteenms.model.Food;

public interface userService {
	
	public List<Food> getAllUserMenu();
	public void addOrder(Date date,List<Long> list);
	

}
