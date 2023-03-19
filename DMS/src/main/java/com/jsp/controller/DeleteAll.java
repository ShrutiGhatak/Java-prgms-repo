package com.jsp.controller;

import com.jsp.dao.EmployeeDao;

public class DeleteAll {

	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDao();
		int n=dao.RemoveAll();
		if (n!=0) {
			System.out.println(n);
		}
		else
			System.out.println("Data not found");
	}
}
