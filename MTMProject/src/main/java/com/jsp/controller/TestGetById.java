package com.jsp.controller;

import java.util.Scanner;

import com.jsp.dao.StdCoursDao;

public class TestGetById {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id to get the data-");
		
		int id=sc.nextInt();
		StdCoursDao dao=new StdCoursDao();
		int x=dao.GetById(id);
		if (x!=0) {
			System.out.println("Data fetched");
		}
		else
			System.out.println("Data not fetched");
	}
}
