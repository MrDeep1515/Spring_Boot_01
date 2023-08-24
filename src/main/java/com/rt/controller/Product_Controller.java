package com.rt.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		
			return "Product Added Successfully";
	}
	
	@GetMapping("/add/id/{id}")
	public Optional<Product_Entity> findProductById(@PathVariable int id) {

		Optional<Product_Entity> pe = service.findProductById(id); 
		
		return pe;
	}
	
	@DeleteMapping("/add/id/{id}")
	public Product_Entity deleteProduct(@PathVariable int id) {

		Product_Entity pe = service.deleteProductById(id);
		
		return pe;
	}

}
