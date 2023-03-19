package com.jsp;

public class Person {

	private int id;
	
	private String name;
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", hadd=" + hadd + ", oadd=" + oadd + "]";
	}

	private Address hadd;
	
	private Address oadd;

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

	public Address getHadd() {
		return hadd;
	}

	public void setHadd(Address hadd) {
		this.hadd = hadd;
	}

	public Address getOadd() {
		return oadd;
	}

	public void setOadd(Address oadd) {
		this.oadd = oadd;
	}
}
