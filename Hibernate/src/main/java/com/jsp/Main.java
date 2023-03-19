package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
public static void main(String[] args) {
	//Load and register and connection
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Disha");
	
	//create statement and execute
	EntityManager entitymanager=entityManagerFactory.createEntityManager();
	
	//Transact with data
	EntityTransaction entityTransaction=entitymanager.getTransaction();
	Student s1=new Student();
	s1.setName("Dinga");
	s1.setGrade('A');
	
	entityTransaction.begin();
	
	//persist is going to save the data
	entitymanager.persist(s1);
	
	entityTransaction.commit();
}
}
