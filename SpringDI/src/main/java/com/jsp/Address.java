package com.jsp;

public class Address {

	private String district;
	
	private String state;
	
	private int pincode;

	public String getDistrict() {
		return district;
	}

	@Override
	public String toString() {
		return "Address [district=" + district + ", state=" + state + ", pincode=" + pincode + "]";
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}
