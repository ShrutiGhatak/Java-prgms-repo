package com.jsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAll {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Disha");
		EntityManager em = emf.createEntityManager();
		
		Query q=em.createQuery("select s from person2 s");
		List<Person> p1=q.getResultList();
		for (Person p:p1) {
			System.out.println("-------------------------------");
			System.out.println("Person Id-"+p.getPersonId());
			System.out.println("Person Name-"+p.getPersonName());
			System.out.println("Person Phone-"+p.getPersonPhone());
			System.out.println("Person Gender-"+p.getPersonGender());
			
			PanCard PCard=p.getpCard();
			System.out.println("PanCard Id-"+PCard.getPid());
			System.out.println("PanCard address-"+PCard.getPaddress());
			System.out.println("PanCard no-"+PCard.getPno());
			
		}
		
	}
}
