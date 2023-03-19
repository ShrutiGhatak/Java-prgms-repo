package com.jsp.controller;

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

public class TestGetById {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id to get the data-");
		int id=sc.nextInt();
		
		MobileSimDao dao=new MobileSimDao();
		dao.GetById(id);
		
	}
}
