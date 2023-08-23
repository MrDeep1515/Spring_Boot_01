package com.rt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rt.entity.Product_Entity;

public interface Product_Dao extends JpaRepository<Product_Entity, Integer> {

}
