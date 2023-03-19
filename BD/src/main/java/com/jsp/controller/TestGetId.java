package com.jsp.controller;

import java.util.Scanner;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class TestGetId {
	public static void main(String[] args) {
		//To interact with DB indirectly
	EmployeeDao dao=new EmployeeDao();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the employee id:");
	Employee emp=dao.GetById(sc.nextInt());
		System.out.println("-----------------------------------------");
		System.out.println("Employee id is "+emp.getId());
		System.out.println("bank name is "+emp.getName());
		System.out.println("bank address is "+emp.getAddress());
		System.out.println("------------------------------------------");
	}
}
