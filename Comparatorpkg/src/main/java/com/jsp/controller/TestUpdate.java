
package com.jsp.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class TestUpdate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Employee> list = new ArrayList<Employee>();
//		list.add(new Employee(335,"Nath",74000.00,LocalDate.of(scanner.nextInt(),scanner.nextInt(),scanner.nextInt())));
//		list.add(new Employee(305,"Priya",66000,LocalDate.of(2020, 06, 18)));
//		list.add(new Employee(245,"Aditya",90000,LocalDate.of(2020, 05, 14)));
//		list.add(new Employee(368,"Raj",86000,LocalDate.of(2020, 05, 14)));
//		list.add(new Employee(301,"Simmy",65000,LocalDate.of(2020, 05, 14)));
		Employee e = new Employee();
		// Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id to be updated-");
		int id = scanner.nextInt();
		e.setId(id);
		System.out.println("Enter the name to be updated-");
		e.setName(scanner.next());
		System.out.println("Enter the salary to be updated-");
		e.setSalary(scanner.nextDouble());
		System.out.println("Enter the Date to be updated-");
		System.out.println("Enter the year-");
		int y = scanner.nextInt();
		System.out.println("Enter the month-");
		int m = scanner.nextInt();
		System.out.println("Enter the date-");
		int d = scanner.nextInt();
		e.setJoinDate(LocalDate.of(y, m, d));
		EmployeeDao dao = new EmployeeDao();
		int x = dao.Update(id, e);

		if (x == 0)
			System.out.println("Data not updated");
		else
			System.out.println("Data updated");
	}
}
