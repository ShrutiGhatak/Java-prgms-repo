package com.jsp.controller;

import com.jsp.dao.EmployeeDao;

public class TestGet {
	
	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDao();
		dao.GetEmployee();
	}
}
