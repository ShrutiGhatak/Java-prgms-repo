package com.jsp.controller;

import java.util.Scanner;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class TestDelete {

	public static void main(String[] args) {
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------Enter the Employee id to be deleted------------------");
		emp.setId(sc.nextInt());

		EmployeeDao dao = new EmployeeDao();
		dao.DeleteEmployee(emp);
	}
}
