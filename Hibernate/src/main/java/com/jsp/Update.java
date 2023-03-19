package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
public static void main(String[] args) {
	//Load and register and connection
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Disha");
		
		//create statement and execute
		EntityManager entitymanager=entityManagerFactory.createEntityManager();
		
		//Transact with data
		EntityTransaction entityTransaction=entitymanager.getTransaction();
		Student s1=new Student();
		s1.setId(1);
		s1.setName("Dingi");
		s1.setGrade('B');
		
		entityTransaction.begin();
		
		//merge is going to update the data
		entitymanager.merge(s1);
		
		entityTransaction.commit();
}
}
