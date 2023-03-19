package com.jsp;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Branch b1=new Branch();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  branch id1 to be updated");
		b1.setId(sc.nextInt());
		System.out.println("Enter the name to be updated-");
		b1.setName(sc.next());
		System.out.println("Enter the address to be updated-");
		b1.setAddress(sc.next());
		
		Branch b2=new Branch();
		System.out.println("Enter the branch id2 to be updated-");
		b2.setId(sc.nextInt());
		System.out.println("Enter the name to be updated-");
		b2.setName(sc.next());
		System.out.println("Enter the address to be updated-");
		b2.setAddress(sc.next());
		
		Branch b3=new Branch();
		System.out.println("Enter the  branch id3 to be updated-");
		b3.setId(sc.nextInt());
		System.out.println("Enter the name to be updated-");
		b3.setName(sc.next());
		System.out.println("Enter the address to be updated-");
		b3.setAddress(sc.next());
		
		School school=new School();
		System.out.println("Enter the sid to be updated-");
		school.setId(sc.nextInt());
		System.out.println("Enter the name to be updated-");
		school.setName(sc.next());
		System.out.println("Enter the address to be updated-");
		school.setAddress(sc.next());
		
		b1.setSchool(school);
		b2.setSchool(school);
		b3.setSchool(school);
		
		et.begin();
		em.merge(b1);
		em.merge(b2);
		em.merge(b3);
		et.commit();
	}
}

