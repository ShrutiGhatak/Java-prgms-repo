package com.jsp.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class TestSave {

	public static void main(String[] args) {
		List<Employee>list=new ArrayList<Employee>();
		list.add(new Employee(331,"Nat",76000.00,LocalDate.of(2020, 05, 14)));
		list.add(new Employee(305,"Priya",66000,LocalDate.of(2020, 06, 18)));
		list.add(new Employee(245,"Aditya",90000,LocalDate.of(2020, 05, 14)));
		list.add(new Employee(368,"Raj",86000,LocalDate.of(2020, 05, 14)));
		list.add(new Employee(301,"Simmy",65000,LocalDate.of(2020, 05, 14)));
		EmployeeDao dao=new EmployeeDao();
		dao.Save(list);
	}
}
