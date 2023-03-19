package com.jsp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student s1=new Student();
		s1.setId(1);
		s1.setName("Ram");
		s1.setAddress("Gujrat");
		
		Student s2=new Student();
		s2.setId(2);
		s2.setName("Sita");
		s2.setAddress("Chennai");
		
		Course c1=new Course();
		c1.setId(1);
		c1.setCoursename("MT1");
		c1.setDuration("4months");
		
		Course c2=new Course();
		c2.setId(2);
		c2.setCoursename("Live project");
		c2.setDuration("5months");
		
		Course c3=new Course();
		c3.setId(3);
		c3.setCoursename("Core Java1");
		c3.setDuration("2.5months");
		
		List<Course> courses=new ArrayList();
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		
		Course c4=new Course();
		c4.setId(4);
		c4.setCoursename("Web Tech1");
		c4.setDuration("2.4months");
		
		Course c5=new Course();
		c5.setId(5);
		c5.setCoursename("Adv Java1");
		c5.setDuration("3.7months");
		
		Course c6=new Course();
		c6.setId(6);
		c6.setCoursename("Selenium1");
		c6.setDuration("1.6months");
		
		List<Course> testing=new ArrayList();
		testing.add(c1);
		testing.add(c2);
		testing.add(c3);
		testing.add(c6);
		
		List<Course> development=new ArrayList<Course>();
		development.add(c2);
		development.add(c3);
		development.add(c4);
		development.add(c5);
		
		//mapping
		s1.setCourses(testing);
		s2.setCourses(development);
		
		et.begin();
		em.merge(s1);
		em.merge(s2);
		et.commit();
	}
}
