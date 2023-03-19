package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestDelete {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Query q=em.createQuery("Delete from studentdetails");
		et.begin();
		q.executeUpdate();
		et.commit();
		
		Query q1=em.createQuery("Delete from coursedetails");
		et.begin();
		q1.executeUpdate();
		et.commit();
	}
}
