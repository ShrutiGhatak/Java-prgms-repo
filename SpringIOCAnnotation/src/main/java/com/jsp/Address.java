package com.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	@Value("Newyork")
	private String city;
	
	@Value("USA")
	private String state;
	
	@Value("765443")
	private int pin;

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pin=" + pin + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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
