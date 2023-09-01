package com.rt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.assertj.core.internal.bytebuddy.implementation.auxiliary.AuxiliaryType.SignatureRelevant;

@Entity
@Table(name = "add_product")
public class Product_Entity {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Size
	@Column(name = "product")
	private String product;
	
	@Column(name = "price")
	private int price;

	public Product_Entity() {

	}

	public Product_Entity(int id, String product, int price) {
		super();
		this.id = id;
		this.product = product;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
