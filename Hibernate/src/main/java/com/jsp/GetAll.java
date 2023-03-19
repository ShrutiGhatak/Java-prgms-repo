package com.jsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAll {
public static void main(String[] args) {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
	
	EntityManager em=emf.createEntityManager();
	
	Query query=em.createQuery("Select s from studentdetails s");
	
	List<Student> s1=query.getResultList();
	
	for (Student s2:s1) {
		System.out.println("-------------------------------");
		System.out.println("Student id is-"+s2.getId());
		System.out.println("Student name is-"+s2.getName());
		System.out.println("Student grade is-"+s2.getGrade());
		System.out.println("-----------------------------------");
		
	}
}
}
