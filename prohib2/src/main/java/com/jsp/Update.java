package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
	EntityManager e1=emf.createEntityManager();
	EntityTransaction et=e1.getTransaction();
	office o=new office();
	o.setId(1);
	o.setName("Dingi");
	o.setDept("Developer");
	et.begin();
	e1.merge(o);
	et.commit();
}
}
