package com.rt.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rt.entity.Product_Entity;

public interface Product_Dao extends JpaRepository<Product_Entity, Integer> {

	List<Product_Entity> findByProduct(String product);

	

}

