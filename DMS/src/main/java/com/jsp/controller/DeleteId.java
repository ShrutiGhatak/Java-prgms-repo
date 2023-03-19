package com.jsp.controller;

import java.util.Scanner;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class DeleteId {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	EmployeeDao dao=new EmployeeDao();
	System.out.println("Enter the id to be deleted-");
	Employee e=dao.DeleteId(sc.nextInt());
	
	if (e==null) {
		System.out.println("Data is deleted");
	}
	else
		System.out.println("Data is not deleted");
	
}
}
