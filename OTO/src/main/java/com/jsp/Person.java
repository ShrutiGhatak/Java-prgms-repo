package com.jsp;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "person2")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int PersonId;
	
	private String PersonName;
	
	private String PersonGender;
	
	private long PersonPhone;
	
	@OneToOne
	
	private PanCard pCard;

	public PanCard getpCard() {
		return pCard;
	}

	public void setpCard(PanCard pCard) {
		this.pCard = pCard;
	}

	public int getPersonId() {
		return PersonId;
	}

	public void setPersonId(int personId) {
		PersonId = personId;
	}

	public String getPersonName() {
		return PersonName;
	}

	public void setPersonName(String personName) {
		PersonName = personName;
	}

	public String getPersonGender() {
		return PersonGender;
	}

	public void setPersonGender(String personGender) {
		PersonGender = personGender;
	}

	public long getPersonPhone() {
		return PersonPhone;
	}

	public void setPersonPhone(long personPhone) {
		PersonPhone = personPhone;
	}
	
}