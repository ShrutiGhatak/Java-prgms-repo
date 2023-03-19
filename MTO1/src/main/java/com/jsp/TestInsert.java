package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestInsert {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Branch b1=new Branch();
		b1.setName("BV1");
		b1.setAddress("Bangalore");
		
		Branch b2=new Branch();
		b2.setName("BV2");
		b2.setAddress("Kolkata");
		
		Branch b3=new Branch();
		b3.setName("BV3");
		b3.setAddress("Chennai");
		
		School school=new School();
		school.setName("BV");
		school.setAddress("Hyderabad");
		
		b1.setSchool(school);
		b2.setSchool(school);
		b3.setSchool(school);
		
		et.begin();
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);
		et.commit();
	}
}
