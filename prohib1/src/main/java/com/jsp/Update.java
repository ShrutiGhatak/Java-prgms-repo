package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
public static void main(String[] args) {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
	
	EntityManager em=emf.createEntityManager();
	
	EntityTransaction et=em.getTransaction();
	
	Parlour p1=new Parlour();
	p1.setId(1);
	p1.setName("ThaiSpa");
	p1.setSection("Bodyspa");
	
     et.begin();
	
	//merge is going to save the data
	em.merge(p1);
	
	et.commit();
}
}
