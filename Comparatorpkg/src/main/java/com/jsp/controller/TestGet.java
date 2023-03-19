package com.jsp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class TestGet {

	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDao();
		
		List<Employee> l=new ArrayList<Employee>();
				List l2=dao.GetAll(l);
				System.out.println(l2);
		
			
		}
	}
