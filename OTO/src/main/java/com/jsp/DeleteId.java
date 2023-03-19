package com.jsp;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteId {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Disha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id to be deleted-");
		int id=sc.nextInt();
		
		Person person=em.find(Person.class, id);
		
		if (person != null) {
			et.begin();
			em.remove(person);
			et.commit();
		}
		
		PanCard PCard=person.getpCard();
		
		if (PCard != null) {
			et.begin();
			em.remove(PCard);
			et.commit();
		}
	}
}
