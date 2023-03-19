package com.jsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAll {

	public static void main(String[] args) {
		

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
		EntityManager em=emf.createEntityManager();
		//EntityTransaction et=em.getTransaction();
		
		Query q=em.createQuery("Select s from studentdata s");
		Query q1=em.createQuery("Select c from coursedata c");
		
		List<Student> s=q.getResultList();
		for (Student s1 : s) {
			
			System.out.println("Id-"+s1.getId());
			System.out.println("Name-"+s1.getName());
			System.out.println("Address-"+s1.getAddress());
			
			List<Course> c=q1.getResultList();
			for (Course c1 : c) {
				
				System.out.println("Id-"+c1.getId());
				System.out.println("Name-"+c1.getCoursename());
				System.out.println("Duration-"+c1.getDuration());
			}
		}
	}
}
