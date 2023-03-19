package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteId {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Disha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Person person=em.find(Person.class, 2);
		
		if (person != null) {
			et.begin();
			em.remove(person);
			et.commit();
		}
		
		AadharCard aadharCard=person.getAadharCard();
		
		if (aadharCard != null) {
			et.begin();
			em.remove(aadharCard);
			et.commit();
		}
		
		
	}
}
