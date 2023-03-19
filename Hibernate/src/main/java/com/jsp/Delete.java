package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
		
		EntityManager em=emf.createEntityManager();
		
		Student s1=em.find(Student.class, 1);
		
		EntityTransaction et=em.getTransaction();
		
		if (s1!=null) {
			et.begin();
			em.remove(s1);
			et.commit();
			
		}
		else {
			System.out.println("Data Not Found!!!-----");
		}
	}
	
}
