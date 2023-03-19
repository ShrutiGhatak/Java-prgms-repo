package com.jsp;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetById {
public static void main(String[] args) {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
	
	EntityManager e= emf.createEntityManager();
	
	Student student=e.find(Student.class, 2);
	
	if (student != null) {
		System.out.println("-------------------------------");
		System.out.println("Student id is-"+student.getId());
		System.out.println("Student name is-"+student.getName());
		System.out.println("Student grade is-"+student.getGrade());
		
	}
	else {
		System.out.println("No data Found!!!----");
	}
}
}
