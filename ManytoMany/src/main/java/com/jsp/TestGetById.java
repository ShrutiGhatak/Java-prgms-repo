package com.jsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetById {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
		EntityManager em=emf.createEntityManager();
		//EntityTransaction et=em.getTransaction();
		
		Student s=em.find(Student.class, 2);
		System.out.println("SId-"+s.getId());
		System.out.println("Name-"+s.getName());
		System.out.println("Address-"+s.getAddress());
		
		List<Course> c=s.getCourses();
		for (Course c1 : c) {
			System.out.println("CId-"+c1.getId());
			System.out.println("Name-"+c1.getCoursename());
			System.out.println("Duration-"+c1.getDuration());
			
		}
		
	}
}
