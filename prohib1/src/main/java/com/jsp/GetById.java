package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetById {
public static void main(String[] args) {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
	
	EntityManager e= emf.createEntityManager();
	
	Parlour p=e.find(Parlour.class, 2);
	
	if (p != null) {
		System.out.println("-------------------------------");
		System.out.println("Student id is-"+p.getId());
		System.out.println("Student name is-"+p.getName());
		System.out.println("Student grade is-"+p.getSection());
		
	}
	else {
		System.out.println("No data Found!!!----");
	}
}
}
