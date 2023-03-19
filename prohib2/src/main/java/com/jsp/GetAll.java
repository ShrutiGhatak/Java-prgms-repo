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
	Query query=em.createQuery("Select s from officedata s");
	List<office> s1=query.getResultList();
	for (office p:s1) {
		System.out.println("----------------------");
		System.out.println("Id-"+p.getId());
		System.out.println("Name-"+p.getName());
		System.out.println("Section-"+p.getDept());
	}
}
}
