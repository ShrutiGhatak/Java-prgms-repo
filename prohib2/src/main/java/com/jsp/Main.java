package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
	EntityManager e1=emf.createEntityManager();
	EntityTransaction et=e1.getTransaction();
	office o=new office();
	o.setName("Dinga");
	o.setDept("Accounts");
	et.begin();
	e1.persist(o);
	et.commit();
}
}
