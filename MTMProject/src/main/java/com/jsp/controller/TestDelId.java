package com.jsp.controller;

import java.util.Scanner;

import com.jsp.dao.StdCoursDao;

public class TestDelId {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id to delete the data");
		int id=sc.nextInt();
		StdCoursDao dao=new StdCoursDao();
		dao.DelById(id);
//		if (x!=0) {
//			System.out.println("Data not deleted");
//		}
//		else
//			System.out.println("Data deleted");
	}
}
