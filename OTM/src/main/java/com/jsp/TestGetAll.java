package com.jsp;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
public class TestGetAll {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
	EntityManager em=emf.createEntityManager();
	//EntityTransaction et=em.getTransaction();
	Query q=em.createQuery("Select s from Mobile s");
	List<Mobile>p=q.getResultList();
	for (Mobile p1:p) {
		System.out.println("-------------------------------");
		System.out.println("Mobile Id-"+p1.getId());
		System.out.println("Mobile Brand-"+p1.getBrand());
		System.out.println("Mobile model-"+p1.getModel());
		System.out.println("Mobile price-"+p1.getPrice());
		
		List<Sims>sim=p1.getS1();
		for (Sims s2:sim) {
			System.out.println("Sim Id-"+s2.getId());
			System.out.println("Mobile Brand-"+s2.getNetwork());
			System.out.println("Mobile model-"+s2.getNumber());
			System.out.println("Mobile price-"+s2.getProvider());
		}
		
	}
}
}
