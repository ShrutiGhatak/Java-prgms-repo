package com.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class TestDelete {

	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDao();
		List<Employee> l=new ArrayList<Employee>();
		dao.Del(l);
	}
}
