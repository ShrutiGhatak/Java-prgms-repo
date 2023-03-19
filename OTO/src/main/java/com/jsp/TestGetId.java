package com.jsp;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetId {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Disha");
		EntityManager em = emf.createEntityManager();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id to get");
		int id=sc.nextInt();
		Person person=em.find(Person.class, id);
		
		System.out.println("-------------------------------");
		
		System.out.println("Person Id-"+person.getPersonId());
		System.out.println("Person Id-"+person.getPersonName());
		System.out.println("Person Id-"+person.getPersonGender());
		System.out.println("Person Id-"+person.getPersonPhone());
		
		System.out.println("---------------------------------");
		
		PanCard PCard=person.getpCard();
		
		System.out.println("PanCard Id-"+PCard.getPid());
		System.out.println("PanCard no-"+PCard.getPno());
		System.out.println("PanCard address-"+PCard.getPaddress());
		
		System.out.println("------------------------------");
		
	}
}
