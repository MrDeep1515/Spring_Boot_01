package com.rt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rt.dao.Product_Dao;
import com.rt.entity.Product_Entity;

@Component
public class Product_Service {
	
	@Autowired
	Product_Dao dao;

	public void add(Product_Entity pe) {
		
		dao.save(pe);
		
	}
	
	

}
