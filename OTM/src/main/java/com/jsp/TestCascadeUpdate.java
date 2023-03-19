package com.jsp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestCascadeUpdate {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Mobile m1=new Mobile();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id to be updated-");
		m1.setId(sc.nextInt());
		System.out.println("Enter the Brand to be updated-");
		m1.setBrand(sc.next());
		System.out.println("Enter the model to be updated-");
		m1.setModel(sc.next());
		System.out.println("Enter the price to be updated-");
		m1.setPrice(sc.nextLong());
		
		Sims sim1=new Sims();
		System.out.println("Enter the id to be updated-");
		sim1.setId(sc.nextInt());
		System.out.println("Enter the network to be updated-");
		sim1.setNetwork(sc.next());
		System.out.println("Enter the Provider to be updated-");
		sim1.setProvider(sc.next());
		System.out.println("Enter the no to be updated-");
		sim1.setNumber(sc.nextLong());
		
		Sims sim2=new Sims();
		System.out.println("Enter the id to be updated-");
		sim2.setId(sc.nextInt());
		System.out.println("Enter the network to be updated-");
		sim2.setNetwork(sc.next());
		System.out.println("Enter the Provider to be updated-");
		sim2.setProvider(sc.next());
		System.out.println("Enter the no to be updated-");
		sim2.setNumber(sc.nextLong());
		//mapping
		List<Sims>l=new ArrayList<Sims>();
		l.add(sim1);
		l.add(sim2);
		m1.setS1(l);
	
		et.begin();
		em.merge(m1);
//		em.merge(sim1);
//		em.merge(sim2);
		et.commit();
	}
}
