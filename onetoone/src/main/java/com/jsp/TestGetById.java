package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestGetById {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Disha");
		EntityManager em = emf.createEntityManager();
		
		Person person=em.find(Person.class, 2);
		
		System.out.println("-------------------------------");
		
		System.out.println("Person Id-"+person.getPersonId());
		System.out.println("Person Id-"+person.getPersonName());
		System.out.println("Person Id-"+person.getPersonGender());
		System.out.println("Person Id-"+person.getPersonPhone());
		
		System.out.println("---------------------------------");
		
		AadharCard aadharCard=person.getAadharCard();
		
		System.out.println("AAdharCard Id-"+aadharCard.getAadharId());
		System.out.println("AAdharCard Id-"+aadharCard.getAadharNumber());
		System.out.println("AAdharCard Id-"+aadharCard.getAddress());
		
		System.out.println("------------------------------");
		
	}
}
