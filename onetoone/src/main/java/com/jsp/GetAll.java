package com.jsp;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAll {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Disha");
		EntityManager em = emf.createEntityManager();
		
		Query q=em.createQuery("select s from person s");
		List<Person> p1=q.getResultList();
		for (Person p:p1) {
			System.out.println("-------------------------------");
			System.out.println("Person Id-"+p.getPersonId());
			System.out.println("Person Name-"+p.getPersonName());
			System.out.println("Person Phone-"+p.getPersonPhone());
			System.out.println("Person Gender-"+p.getPersonGender());
			
			AadharCard aadharCard=p.getAadharCard();
			System.out.println("AadharCard Id-"+aadharCard.getAadharId());
			System.out.println("AadharCard Number-"+aadharCard.getAadharNumber());
			System.out.println("AadharCard Address-"+aadharCard.getAddress());
			
		}
		
			
		}
		
	}


