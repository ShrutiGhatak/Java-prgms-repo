package com.jsp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dao.MobileSimDao;
import com.jsp.dto.Mobile;
import com.jsp.dto.Sims;

//import com.jsp.Mobile;
//import com.jsp.Sims;

public class TestUpdate {

	public static void main(String[] args) {
		
		Mobile m1=new Mobile();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id to be updated-");
		m1.setId(sc.nextInt());
		System.out.println("Enter the Brand to be updated-");
		m1.setBrand(sc.next());
		System.out.println("Enter the model to be updated-");
		m1.setModel(sc.next());
		System.out.println("Enter the price to be updated-");
		m1.setPrice(sc.nextLong());
		
		Sims sim1=new Sims();
		System.out.println("Enter the id to be updated for sim1-");
		sim1.setId(sc.nextInt());
		System.out.println("Enter the network to be updated-");
		sim1.setNetwork(sc.next());
		System.out.println("Enter the Provider to be updated-");
		sim1.setProvider(sc.next());
		System.out.println("Enter the no to be updated-");
		sim1.setNumber(sc.nextLong());
		
		Sims sim2=new Sims();
		System.out.println("Enter the id to be updated for sim2-");
		sim2.setId(sc.nextInt());
		System.out.println("Enter the network to be updated-");
		sim2.setNetwork(sc.next());
		System.out.println("Enter the Provider to be updated-");
		sim2.setProvider(sc.next());
		System.out.println("Enter the no to be updated-");
		sim2.setNumber(sc.nextLong());
		//mapping
		List<Sims>l=new ArrayList<Sims>();
		l.add(sim1);
		l.add(sim2);
		m1.setS1(l);
	
		MobileSimDao dao=new MobileSimDao();
		dao.Update(m1);
		
	}
}
