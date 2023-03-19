package com.jsp.controller;

import java.util.Scanner;

import com.jsp.dao.PVDao;
import com.jsp.dto.Person;
import com.jsp.dto.VoterCard;

public class TestSave {

	public static void main(String[] args) {
		
		Person p=new Person();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name-");
		p.setName(sc.next());
		System.out.println("Enter the phone no-");
		p.setPhone(sc.nextLong());
		
		VoterCard vc=new VoterCard();
		
		System.out.println("Enter the Voter no-");
		vc.setVno(sc.nextLong());
		System.out.println("Enter the Voter address-");
		vc.setVaddress(sc.next());
		
		sc.close();
		
		// one to one Mapping
		p.setvCard(vc);
		
		PVDao pvd=new PVDao();
		pvd.SaveData(p, vc);
		
	}
}
