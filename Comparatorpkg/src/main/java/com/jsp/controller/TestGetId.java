package com.jsp.controller;

import java.util.Scanner;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class TestGetId {
public static void main(String[] args) {
	EmployeeDao dao=new EmployeeDao();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the id to get the data-");
	Employee e=dao.GetById(sc.nextInt());
	if (e!=null) {
		System.out.println("----------------------------");
		System.out.println("Id-"+e.getId());
		System.out.println("Name-"+e.getName());
		System.out.println("Salary-"+e.getSalary());
		System.out.println("Date-"+e.getJoinDate());
		System.out.println("--------------------------------");
	}
	else
		System.out.println("Data not found");
}
}
