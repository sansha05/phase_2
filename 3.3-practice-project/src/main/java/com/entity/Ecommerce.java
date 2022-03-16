package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ecommerce_13")
public class Ecommerce {
	
	@Id
	@GeneratedValue
	@Column(name="product_id")
	private int id;
	
	@Column(name="product_name")
	private int productName;
	
	@Column(name="product_price")
	private int price;

}
