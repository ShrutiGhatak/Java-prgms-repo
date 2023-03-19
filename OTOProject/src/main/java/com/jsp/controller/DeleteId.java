package com.jsp.controller;

import java.util.Scanner;

import com.jsp.dao.PVDao;
import com.jsp.dto.Person;

public class DeleteId {

	public static void main(String[] args) {
       
		Person p=new Person();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the id to delete the data-");
		int id=sc.nextInt();
		
		PVDao pvd=new PVDao();
		pvd.DelId(id);
	}
}
