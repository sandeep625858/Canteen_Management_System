package com.canteen.canteenms.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canteen.canteenms.dao.menuDao;
import com.canteen.canteenms.model.Food;

@Service
public class userServiceImpl implements userService{

	@Autowired
	private menuDao mDao;
	
	
	@Override
	public List<Food> getAllUserMenu() {
		return this.mDao.findAll();
	}


	@Override
	public void addOrder(Date date, List<Long> list) {
		
		for (Long long1 : list) {
			menuDao.addOrder(date,long1);
		}
		
	}

	

	
	
}
