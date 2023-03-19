package com.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "votercard")
public class VoterCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vid;
	
	private long vno;
	
	private String vaddress;

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public long getVno() {
		return vno;
	}

	public void setVno(long vno) {
		this.vno = vno;
	}

	public String getVaddress() {
		return vaddress;
	}

	public void setVaddress(String vaddress) {
		this.vaddress = vaddress;
	}
	
	
}
