package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Disha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person person=new Person();
		person.setPersonName("Pinki");
		person.setPersonGender("Female");
		person.setPersonPhone(3334466221l);
		
		AadharCard aadharCard=new AadharCard();
		aadharCard.setAadharNumber(7788766655l);
		aadharCard.setAddress("Howrah");
		
		//Relationship or Mapping
		
		person.setAadharCard(aadharCard);
		et.begin();
		em.persist(person);
		em.persist(aadharCard);
		et.commit();
	}
}
