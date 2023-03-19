package com.jsp.controller;

import java.util.List;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class GetSpecificId {

	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDao();
		List<Employee> l=dao.GetSpecificId();
		for (Employee e:l) {
			if (e.getId()>300) {
				System.out.println("----------------------------");
				System.out.println("Id-"+e.getId());
				System.out.println("Name-"+e.getName());
				System.out.println("Salary-"+e.getSalary());
				System.out.println("Date-"+e.getJoinDate());
				System.out.println("--------------------------------");
			}
     }
}
}
