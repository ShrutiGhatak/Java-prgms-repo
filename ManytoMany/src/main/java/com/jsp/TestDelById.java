package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestDelById {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		//Student s=em.find(Student.class, 1);
		Query q=em.createQuery("Delete from studentdata where id=1");
		et.begin();
		q.executeUpdate();
		et.commit();
		
	}
}
