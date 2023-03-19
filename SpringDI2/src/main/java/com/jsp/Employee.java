package com.jsp;

public class Employee {

	private int id;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", haddress=" + haddress + ", oaddress=" + oaddress + "]";
	}

	private String name;
	
	private Address haddress;
	
	private Address oaddress;

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

	public Address getHaddress() {
		return haddress;
	}

	public void setHaddress(Address haddress) {
		this.haddress = haddress;
	}

	public Address getOaddress() {
		return oaddress;
	}

	public void setOaddress(Address oaddress) {
		this.oaddress = oaddress;
	}
}
