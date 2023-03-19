package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Course;
import com.jsp.dto.Student;

public class StdCoursDao {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void Save(Student s1,Student s2) {
		et.begin();
		em.persist(s1);
		em.persist(s2);
		et.commit();
	}
	public void Update(Student s1,Student s2) {
		et.begin();
		em.merge(s1);
		em.merge(s2);
		et.commit();
	}
	public int GetById(int id) {
		Student s=em.find(Student.class, id);
		System.out.println("Sid-"+s.getId());
		System.out.println("Sname-"+s.getName());
		System.out.println("Address-"+s.getAddress());
		
		List<Course> c=s.getCourses();
		for (Course c1 : c) {
			System.out.println("Cid-"+c1.getId());
			System.out.println("Cname-"+c1.getCoursename());
			System.out.println("Cduration-"+c1.getDuration());
			
		}
		return id;
		}
	public void GetAll() {
		
		Query q=em.createQuery("select s from stud s");
		Query q1=em.createQuery("select c from cd c");
		List<Student> s=q.getResultList();
		for (Student s1 : s) {
			System.out.println("Sid-"+s1.getId());
			System.out.println("Sname-"+s1.getName());
			System.out.println("Address-"+s1.getAddress());
			List<Course> c=q1.getResultList();
			for (Course c1 : c) {
				System.out.println("Cid-"+c1.getId());
				System.out.println("Cname-"+c1.getCoursename());
				System.out.println("Cduration-"+c1.getDuration());
		}
	}
	}
	public void DelById(int id1) {
		Student s=em.find(Student.class, id1);
		et.begin();
		em.remove(s);
		et.commit();
	}
	public void DelAll() {
		Query q=em.createQuery("Delete from std");
		et.begin();
		q.executeUpdate();
		et.commit();
		
		Query q1=em.createQuery("Delete from cd");
		et.begin();
		q1.executeUpdate();
		et.commit();
	}
}


