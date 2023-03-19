package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSave {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
        Student S=(Student)context.getBean("student");
		
		System.out.println(S);
		et.begin();
		em.persist(S);
		et.commit();
		
	}
}
