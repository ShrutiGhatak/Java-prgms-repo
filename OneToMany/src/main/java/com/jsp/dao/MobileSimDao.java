package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Mobile;
import com.jsp.dto.Sims;

public class MobileSimDao {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void Save(Mobile m)
	{
		et.begin();
		em.persist(m);
		//em.persist(sim1);
		//em.persist(sim2);
		et.commit();
	}
	public void Update(Mobile m) {
		
		et.begin();
		em.merge(m);
//		em.merge(sim1);
//		em.merge(sim2);
		et.commit();
	}
	public void GetById(int id) {
		
		Mobile m1=em.find(Mobile.class, id);
		
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
	public void DelById(int id) {
		
		Mobile m1=em.find(Mobile.class, id);
		if (m1!=null) {
		   et.begin();
		   em.remove(m1);
		   et.commit();
			
		}
		}
	public void GetAll() {
		
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
	public void DelAll() {
		
		Query q=em.createQuery("Delete from Mobile");
		et.begin();
		int n=q.executeUpdate();
		et.commit();
		
		Query q1=em.createQuery("Delete from Sims");
		et.begin();
		int m=q1.executeUpdate();
		et.commit();
	}
	}

