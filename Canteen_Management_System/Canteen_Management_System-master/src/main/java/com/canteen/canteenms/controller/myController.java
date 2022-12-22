package com.canteen.canteenms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.canteen.canteenms.model.Food;
import com.canteen.canteenms.model.orderSelect;
import com.canteen.canteenms.service.userServiceImpl;

@RestController
@RequestMapping("/user")
public class myController {
	
	@Autowired
	userServiceImpl service;

	@GetMapping("/menu")
	public List<Food> getAllUserMenu() {
		
		return this.service.getAllUserMenu();
		
	}
	
	@PostMapping("/menu/selection")
	public void addOrder(@RequestBody orderSelect oSelect) {
		
		System.out.println(oSelect.getDate());
		System.out.println(oSelect.getFoodIdList());
		this.service.addOrder(oSelect.getDate(), oSelect.getFoodIdList());
		
	}
	
	@PostMapping("/menu/optOut")
	public void optOut(@RequestBody orderSelect oSelect) {
		
		this.service.addOrder(oSelect.getDate(), null);
		
	}
	
		
}
