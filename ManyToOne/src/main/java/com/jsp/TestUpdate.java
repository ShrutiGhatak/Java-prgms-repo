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
		System.out.println("Enter the id to be updated-");
		b1.setId(sc.nextInt());
		System.out.println("Enter the name to be updated-");
		b1.setName(sc.next());
		System.out.println("Enter the address to be updated-");
		b1.setAddress(sc.next());
		
		Branch b2=new Branch();
		System.out.println("Enter the id to be updated-");
		b2.setId(sc.nextInt());
		System.out.println("Enter the name to be updated-");
		b2.setName(sc.next());
		System.out.println("Enter the address to be updated-");
		b2.setAddress(sc.next());
		
		Branch b3=new Branch();
		System.out.println("Enter the id to be updated-");
		b3.setId(sc.nextInt());
		System.out.println("Enter the name to be updated-");
		b3.setName(sc.next());
		System.out.println("Enter the address to be updated-");
		b3.setAddress(sc.next());
		
		Hospital hospital=new Hospital();
		System.out.println("Enter the hid to be updated-");
		hospital.setId(sc.nextInt());
		System.out.println("Enter the name to be updated-");
		hospital.setName(sc.next());
		System.out.println("Enter the address to be updated-");
		hospital.setAddress(sc.next());
		
		b1.setHospital(hospital);
		b2.setHospital(hospital);
		b3.setHospital(hospital);
		
		et.begin();
		em.merge(b1);
		em.merge(b2);
		em.merge(b3);
		et.commit();
	}
}
