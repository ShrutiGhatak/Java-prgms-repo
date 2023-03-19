package com.jsp.controller;

import java.util.Scanner;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class TestSave {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Employee e=new Employee();
	EmployeeDao dao=new EmployeeDao();
	System.out.println("Enter the name-");
	e.setName(sc.next());
	System.out.println("Enter the dept-");
	e.setDept(sc.next());
	Employee e1=dao.SaveData(e);
	if (e1!=null) {
		System.out.println("Data inserted Successfully");
	}
	else
		System.out.println("Data is not inserted successfully");
}
}
