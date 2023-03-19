package com.jsp;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Disha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Scanner sc=new Scanner(System.in);
		Person person=new Person();
		System.out.println("Enter the name-");
		person.setPersonName(sc.next());
		System.out.println("Enter the gender-");
		person.setPersonGender(sc.next());
		System.out.println("Enter the no-");
		person.setPersonPhone(sc.nextLong());
		
		PanCard pCard=new PanCard();
		System.out.println("Enter the pancard no-");
		pCard.setPno(sc.nextLong());
		System.out.println("Enter the address-");
		pCard.setPaddress(sc.next());
		
		//Relationship or Mapping
		
				person.setpCard(pCard);
				et.begin();
				em.persist(person);
				em.persist(pCard);
				et.commit();
	}
}
