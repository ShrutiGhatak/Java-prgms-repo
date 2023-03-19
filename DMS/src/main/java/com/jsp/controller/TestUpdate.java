package com.jsp.controller;

import java.util.Scanner;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class TestUpdate {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	Employee e= new Employee();
	EmployeeDao dao=new EmployeeDao();
	System.out.println("Enter the id to be updated-");
	e.setId(sc.nextInt());
	System.out.println("Enter the name to be updated-");
	e.setName(sc.next());
	System.out.println("Enter the dept to be updated-");
	e.setDept(sc.next());
	int id=dao.UpdateData(sc.nextInt(), e);
	
	if (id!=0) {
		System.out.println("Data updated Successfully");
	}
	else {
		System.out.println("Data is not updated successfully");
	}
}
}
