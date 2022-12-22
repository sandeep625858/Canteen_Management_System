package com.canteen.canteenms.dao;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.canteen.canteenms.model.Food;

public interface menuDao extends JpaRepository<Food, Long>{
	
	@Query("Insert into Order values (100,:foodId,:date)")
	public static void addOrder(@Param("date") Date date,@Param("foodId") long foodId) {
		
	}

}
