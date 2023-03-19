package com.jsp;

public class Address {

	private String district;
	
	private String state;
	
	private int pin;

	@Override
	public String toString() {
		return "Address [district=" + district + ", state=" + state + ", pin=" + pin + "]";
	}

	public String getDistrict() {
		return district;
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

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
}
