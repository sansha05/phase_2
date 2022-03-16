package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_14")
public class Product {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String productName;
	
	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	public Product() {
		super();
	}
	
	
	
	public Product(int id, String productName, double price) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
	}
	
	

}
