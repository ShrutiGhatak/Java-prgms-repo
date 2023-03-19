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

public class TestSave {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Mobile m1=new Mobile();
		System.out.println("Enter the Brand name-");
		m1.setBrand(sc.next());
		System.out.println("Enter the model name-");
		m1.setModel(sc.next());
		System.out.println("Enter the price-");
		m1.setPrice(sc.nextLong());
		
		Sims sim1=new Sims();
		System.out.println("Enter the network for sim1-");
		sim1.setNetwork(sc.next());
		System.out.println("Enter the provider-");
		sim1.setProvider(sc.next());
		System.out.println("Enter the number-");
		sim1.setNumber(sc.nextLong());
		
		Sims sim2=new Sims();
		System.out.println("Enter the network for sim2-");
		sim2.setNetwork(sc.next());
		System.out.println("Enter the provider-");
		sim2.setProvider(sc.next());
		System.out.println("Enter the number-");
		sim2.setNumber(sc.nextLong());
		
		//mapping
		List<Sims>l=new ArrayList<Sims>();
		l.add(sim1);
		l.add(sim2);
		m1.setS1(l);
	
		MobileSimDao dao=new MobileSimDao();
		dao.Save(m1);
		
	}
	}
