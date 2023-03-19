package com.jsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestGetById {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Mobile m1=em.find(Mobile.class, 2);
		if (m1!=null) {
			System.out.println("-----------------------------------");
			System.out.println("Mobile-Id is-"+m1.getId());
			System.out.println("Mobile Brand is-"+m1.getBrand());
			System.out.println("Mobile model is-"+m1.getModel());
			System.out.println("Mobile price is-"+m1.getPrice());
			
			List<Sims> sims=m1.getS1();
			for (Sims s2:sims) {
				System.out.println("---------------------------");
				System.out.println("Sim id is-"+s2.getId());
				System.out.println("Sim Network is-"+s2.getNetwork());
				System.out.println("Sim number is-"+s2.getNumber());
				System.out.println("Sim provider is-"+s2.getProvider());
				System.out.println("-----------------------------------");
			}
		}
		else
			System.out.println("Data not found");
	} 
	
}
