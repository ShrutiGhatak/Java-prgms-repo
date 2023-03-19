package com.jsp;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Mobile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MobileId")
	private int id;
	
	@Column(name = "MobileBrand")
	private String brand;
	
	@Column(name = "Mobilemodel")
	private String model;
	
	@Column(name = "MRP")
	private long price;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Sims> s1;

	
	public List<Sims> getS1() {
		return s1;
	}

	public void setS1(List<Sims> s1) {
		this.s1 = s1;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
}
