package com.rt.service;

import java.util.List;
import java.util.Optional;

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

	public Optional<Product_Entity> findProductById(int id) {

		Optional<Product_Entity> pe = dao.findById(id);

		return pe;
	}

	public List<Product_Entity> findByProduct(String product) {
		
		List<Product_Entity> pe = dao.findByProduct(product);

		return pe;
	}

	public Product_Entity deleteProductById(int id) {

		dao.deleteById(id);

		return null;
	}

	public List<Product_Entity> findAllProduct() {
		List<Product_Entity> pe = dao.findAll();
		return pe;
	}

	

}
