package com.jsp.controller;

import java.util.Scanner;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class GetById {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		EmployeeDao dao=new EmployeeDao();
		System.out.println("Enter the id-");
		Employee e=dao.GetId(sc.nextInt());
		
		if (e!=null) {
			System.out.println("----------------------------");
			System.out.println("ID-"+e.getId());
			System.out.println("Name-"+e.getName());
			System.out.println("Dept-"+e.getDept());
		}
	}
}
