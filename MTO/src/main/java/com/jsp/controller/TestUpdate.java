package com.jsp.controller;

import java.util.Scanner;

import com.jsp.dao.BankBranchDao;
import com.jsp.dto.Bank;
import com.jsp.dto.Branch;

public class TestUpdate {

	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
		
		Branch b1=new Branch();
		System.out.println("Enter the branch id1 to be updated-");
		b1.setId(sc.nextInt());
		System.out.println("Enter the branch name1-");
		b1.setName(sc.next());
		System.out.println("Enter the address for branch1-");
		b1.setAddress(sc.next());
		
		Branch b2=new Branch();
		System.out.println("Enter the branch id2 to be updated-");
		b2.setId(sc.nextInt());
		System.out.println("Enter the branch name2-");
		b2.setName(sc.next());
		System.out.println("Enter the address for branch2-");
		b2.setAddress(sc.next());
		
		Branch b3=new Branch();
		System.out.println("Enter the branch id3to be updated-");
		b3.setId(sc.nextInt());
		System.out.println("Enter the branch name3-");
		b3.setName(sc.next());
		System.out.println("Enter the address for branch3-");
		b3.setAddress(sc.next());
		
		Bank b=new Bank();
		System.out.println("Enter the bank id to be updated-");
		b.setId(sc.nextInt());
		System.out.println("Enter the bank name-");
		b.setName(sc.next());
		System.out.println("Enter the bank address-");
		b.setAddress(sc.next());
		
		b1.setBank(b);
		b2.setBank(b);
		b3.setBank(b);
		
		BankBranchDao dao=new BankBranchDao();
		dao.Update(b1,b2,b3);
	}
}
