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
		b1.setName("CMC001");
		b1.setAddress("Bangalore");
		
		Branch b2=new Branch();
		b2.setName("CMC002");
		b2.setAddress("Kolkata");
		
		Branch b3=new Branch();
		b3.setName("CMC003");
		b3.setAddress("Chennai");
		
		Hospital hospital=new Hospital();
		hospital.setName("CMC");
		hospital.setAddress("Agra");
		
		b1.setHospital(hospital);
		b2.setHospital(hospital);
		b3.setHospital(hospital);
		
		et.begin();
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);
		et.commit();
	}
}
