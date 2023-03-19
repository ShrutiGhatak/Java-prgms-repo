package com.jsp.controller;

import java.util.Scanner;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class TestUpdate {
	public static void main(String[] args) {
		
		Employee emp= new Employee();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("-----Enter the bank data to be updated----");
		
		System.out.println("Enter the id to be updated -");
		
		emp.setId(sc.nextInt());
		
		System.out.println("Enter the bank name-");
		
		emp.setName(sc.next());
		
		System.out.println("Enter the bank address-");
		
		emp.setAddress(sc.next());
		
		EmployeeDao dao=new EmployeeDao();
		dao.UpdateEmployee(emp);
	}

}