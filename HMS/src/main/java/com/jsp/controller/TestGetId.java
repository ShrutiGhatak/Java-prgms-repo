package com.jsp.controller;

//import java.util.List;
import java.util.Scanner;


import com.jsp.dao.PatientDao;
import com.jsp.dto.Patient;

public class TestGetId {
	public static void main(String[] args) {
		//To interact with DB indirectly
	PatientDao dao=new PatientDao();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the patient id:");
	Patient patient=dao.GetById(sc.nextInt());
		System.out.println("-----------------------------------------");
		System.out.println("Patient id is "+patient.getId());
		System.out.println("Patient name is "+patient.getName());
		System.out.println("Patient address is "+patient.getAddress());
		System.out.println("Patient phone is "+patient.getPhone());
		System.out.println("------------------------------------------");
	}
}

