package com.jsp.controller;

import java.util.List;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class GetAll {

	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDao();
		List<Employee>l=dao.readAll();
		
		if (l!=null) {
			
			for (Employee emp:l) {
				System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getDept());
				
			}
			
		}
		else
			System.out.println("Data not found");
	}
}
