package com.jsp.controller;

import java.util.Scanner;

import com.jsp.dao.PVDao;
import com.jsp.dto.Person;
import com.jsp.dto.VoterCard;

public class TestUpdate {
public static void main(String[] args) {
	
	Person p=new Person();
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the id to be updated-");
	p.setId(sc.nextInt());
	System.out.println("Enter the name to be updated-");
	p.setName(sc.next());
	System.out.println("Enter the phone no to be updated-");
	p.setPhone(sc.nextLong());
	
	VoterCard vc=new VoterCard();
	
	System.out.println("Enter the vid to be updated-");
	vc.setVid(sc.nextInt());
	System.out.println("Enter the Voter no to be updated-");
	vc.setVno(sc.nextLong());
	System.out.println("Enter the Voter address to be updated-");
	vc.setVaddress(sc.next());
	
	sc.close();
	
	// one to one Mapping
	p.setvCard(vc);
	
	PVDao pvd=new PVDao();
	pvd.UpdateData(p, vc);
	
}
}
