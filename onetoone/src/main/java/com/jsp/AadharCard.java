package com.jsp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "aadhar")
public class AadharCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int AadharId;
	
	private long AadharNumber;
	
	private String Address;

	public int getAadharId() {
		return AadharId;
	}

	public void setAadharId(int aadharId) {
		AadharId = aadharId;
	}

	public long getAadharNumber() {
		return AadharNumber;
	}

	public void setAadharNumber(long aadharNumber) {
		AadharNumber = aadharNumber;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
}
