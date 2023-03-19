package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetById {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
	EntityManager em=emf.createEntityManager();
	office o=em.find(office.class, 2);
	if (o != null) {
		System.out.println("-------------------------------");
		System.out.println("Student id is-"+o.getId());
		System.out.println("Student name is-"+o.getName());
		System.out.println("Student grade is-"+o.getDept());
		
	}
	else {
		System.out.println("No data Found!!!----");
	}
			
}
}
