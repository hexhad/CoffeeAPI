package com.hashan.coffee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coffee_table")
public class Coffee {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	
	@Column(name = "c_name")
	private String name;
	
	@Column(name = "c_desc")
	private String desc;
	
	@Column(name = "c_order")
	private String order;
	
	@Column(name = "c_price")
	private String price;
	
	@Column(name = "c_imag")
	private String img;
	
	public Coffee() {}

	public Coffee(String name, String desc, String order, String price, String img) {
		super();
		this.name = name;
		this.desc = desc;
		this.order = order;
		this.price = price;
		this.img = img;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getprice() {
		return price;
	}

	public void setprice(String price) {
		this.price = price;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	
	
	
}
