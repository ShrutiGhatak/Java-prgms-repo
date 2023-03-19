package com.jsp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Mobile m1=new Mobile();
		m1.setBrand("Samsung");
		m1.setModel("Galaxy");
		m1.setPrice(15556);
		
		Sims sim1=new Sims();
		sim1.setNetwork("4G");
		sim1.setProvider("JIO");
		sim1.setNumber(8777655643l);
		
		Sims sim2=new Sims();
		sim2.setNetwork("2G");
		sim2.setProvider("JIO");
		sim2.setNumber(8123451123l);
		
		//mapping
		List<Sims>l=new ArrayList<Sims>();
		l.add(sim1);
		l.add(sim2);
		m1.setS1(l);
	
		et.begin();
		em.persist(m1);
		em.persist(sim1);
		em.persist(sim2);
		et.commit();
		
	}
}
