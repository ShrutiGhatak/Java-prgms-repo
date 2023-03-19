package com.jsp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int seaters;
	
	private String model;
	
	@OneToOne
	private CarDriver cardriver;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSeaters() {
		return seaters;
	}

	public void setSeaters(int seaters) {
		this.seaters = seaters;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public CarDriver getCardriver() {
		return cardriver;
	}

	public void setCardriver(CarDriver cardriver) {
		this.cardriver = cardriver;
	}
	
}
