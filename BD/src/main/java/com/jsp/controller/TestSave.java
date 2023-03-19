package com.jsp.controller;

import java.util.Scanner;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class TestSave {
public static void main(String[] args) {
Employee emp=new Employee();
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("****Enter the bank data****");
	
	System.out.println("-----Enter the  id-----");
	
	emp.setId(sc.nextInt());
	
	System.out.println("-----Enter the  name----");
	
	emp.setName(sc.next());
	
	System.out.println("----Enter the  address----");
	
	emp.setAddress(sc.next());
	
	EmployeeDao dao=new EmployeeDao();
	
	dao.SaveEmployee(emp);
}
}

