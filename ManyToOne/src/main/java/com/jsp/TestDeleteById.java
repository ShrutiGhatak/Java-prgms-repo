package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteById {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Disha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Branch b1=em.find(Branch.class, 1);
		Branch b2=em.find(Branch.class, 2);
		Branch b3=em.find(Branch.class, 3);
		
		    et.begin();
			em.remove(b1);
			em.remove(b2);
			em.remove(b3);
		    et.commit();
			
//			Hospital h=em.find(Hospital.class, 1);
//			
//			et.begin();
//			em.remove(b);
//			et.commit();

	}
}
