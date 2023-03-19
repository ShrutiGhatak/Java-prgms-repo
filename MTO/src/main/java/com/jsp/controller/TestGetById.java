package com.jsp.controller;

import java.util.Scanner;

import com.jsp.dao.BankBranchDao;
import com.jsp.dto.Branch;

public class TestGetById {

	public static void main(String[] args) {
        
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id for branch1");
		int id1=sc.nextInt();
		System.out.println("Enter the id for branch2");
		int id2=sc.nextInt();
		System.out.println("Enter the id for branch3");
		int id3=sc.nextInt();
		
		BankBranchDao dao=new BankBranchDao();
		dao.GetById(id1,id2,id3);
	}
}
