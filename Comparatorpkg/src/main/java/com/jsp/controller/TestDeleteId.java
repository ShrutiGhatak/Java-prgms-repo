package com.jsp.controller;

import java.util.Scanner;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class TestDeleteId {

	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDao();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id to delete the data-");
		Employee e=dao.DelById(sc.nextInt());
		if (e==null) 
			System.out.println("Data is deleted");
		else
			System.out.println("Data is not deleted");
	}
}
