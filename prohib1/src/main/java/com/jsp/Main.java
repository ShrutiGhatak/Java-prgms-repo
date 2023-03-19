package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
	
	EntityManager em=emf.createEntityManager();
	
	EntityTransaction et=em.getTransaction();
	
	Parlour p1=new Parlour();
	p1.setName("Habib");
	p1.setSection("Hairspa");
	
     et.begin();
	
	//persist is going to save the data
	em.persist(p1);
	
	et.commit();
}
}
