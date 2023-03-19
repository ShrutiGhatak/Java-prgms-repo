package com.jsp;

public class Mobile {

	private int mobileid;
	
	private String mobname;
	
	private String model;

	public int getMobileid() {
		return mobileid;
	}

	public void setMobileid(int mobileid) {
		this.mobileid = mobileid;
	}

	public String getMobname() {
		return mobname;
	}

	public void setMobname(String mobname) {
		this.mobname = mobname;
	}

	@Override
	public String toString() {
		return "Mobile [mobileid=" + mobileid + ", mobname=" + mobname + ", model=" + model + "]";
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
}
