package com.rt.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rt.entity.Product_Entity;

public interface Product_Dao extends JpaRepository<Product_Entity, Integer> {

	@Query(value = "select e from Product_Entity e where e.product=:product", nativeQuery = false)
	List<Product_Entity> findByProduct(@Param("product") String product);

	/*-----------------------------------------------------------------------------------------------------*/
	
	@Query(value = "select e from Product_Entity e where e.price=:price", nativeQuery = false)
	List<Product_Entity> findByPrice(@Param("price")int price);

	

}

