package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteAll {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Disha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Query q=em.createQuery("delete from person2");
		
		et.begin();
		int n=q.executeUpdate();
		et.commit();
		
		Query q1=em.createQuery("delete from pan");
		
		et.begin();
		int m=q1.executeUpdate();
		et.commit();
		
		System.out.println("Data deleted successfully");
		
	}
}
