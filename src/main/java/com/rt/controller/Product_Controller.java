package com.rt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rt.entity.Product_Entity;
import com.rt.service.Product_Service;

@RestController
public class Product_Controller {

	@Autowired
	Product_Service service;
	
	@RequestMapping("/add")
	public String hello(@RequestBody Product_Entity pe) {

			service.add(pe);
		
		return "Welcome To Spring Boot";
	}

}
