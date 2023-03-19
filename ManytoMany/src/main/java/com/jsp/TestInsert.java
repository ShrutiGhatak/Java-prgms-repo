package com.jsp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestInsert {

	public static void main(String[] args) {

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student s1=new Student();
		s1.setName("Jadu");
		s1.setAddress("Kolkata");
		
		Student s2=new Student();
		s2.setName("Madhu");
		s2.setAddress("Ranchi");
		
		Course c1=new Course();
		c1.setCoursename("Mannual Testing");
		c1.setDuration("1.5months");
		
		Course c2=new Course();
		c2.setCoursename("Sql");
		c2.setDuration("6months");
		
		Course c3=new Course();
		c3.setCoursename("Core Java");
		c3.setDuration("2months");
		
		Course c4=new Course();
		c4.setCoursename("Web Tech");
		c4.setDuration("2months");
		
		Course c5=new Course();
		c5.setCoursename("Adv Java");
		c5.setDuration("3months");
		
		Course c6=new Course();
		c6.setCoursename("Selenium");
		c6.setDuration("1.3months");
		
		List<Course> testing=new ArrayList();
		testing.add(c1);
		testing.add(c3);
		testing.add(c4);
		testing.add(c5);
		
		List<Course> development=new ArrayList<Course>();
		development.add(c2);
		development.add(c3);
		development.add(c4);
		development.add(c5);
		
		//mapping
		s1.setCourses(testing);
		s2.setCourses(development);
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		et.commit();
		
	}
}
