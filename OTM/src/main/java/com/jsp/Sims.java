package com.jsp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sims {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SimID")
	private int id;
	
	@Column(name = "SimNetwork")
	private String network;
	
	@Column(name = "SimProvider")
	private String provider;
	
	@Column(name = "SimNumber")
	private long number;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}
	
	
}
