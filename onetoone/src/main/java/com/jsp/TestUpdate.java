package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Disha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Person p=new Person();
		p.setPersonId(2);
		p.setPersonGender("Female");
		p.setPersonName("Sita");
		p.setPersonPhone(65765765646l);
		
		
		AadharCard aadharCard=new AadharCard();
		
		aadharCard.setAadharId(2);
		aadharCard.setAadharNumber(333333333333l);
		aadharCard.setAddress("London");
		
		p.setAadharCard(aadharCard);
		
		et.begin();
		em.merge(p);
		em.merge(aadharCard);
		et.commit();
		
	}
}
