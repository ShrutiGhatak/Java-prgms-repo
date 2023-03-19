package com.jsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDelById {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Mobile m1=em.find(Mobile.class, 2);
		if (m1!=null) {
			et.begin();
			em.remove(m1);
			et.commit();
		}
		else
			System.out.println("Data not found");
	}
}
