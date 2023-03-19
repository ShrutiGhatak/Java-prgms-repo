package com.jsp.controller;

import java.util.Scanner;

import com.jsp.dao.MobileSimDao;

public class TestDelById {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id to delete the data-");
		int id=sc.nextInt();
		
		MobileSimDao dao=new MobileSimDao();
		dao.DelById(id);
		
	}
}
