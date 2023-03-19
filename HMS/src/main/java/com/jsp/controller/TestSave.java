package com.jsp.controller;

import java.util.Scanner;


import com.jsp.dao.PatientDao;
import com.jsp.dto.Patient;

public class TestSave {
public static void main(String[] args) {
	
	Patient patient=new Patient();
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("****Enter the patient details****");
	
	System.out.println("-----Enter the patient id-----");
	
	patient.setId(sc.nextInt());
	
	System.out.println("-----Enter the patient name----");
	
	patient.setName(sc.next());
	
	System.out.println("----Enter the patient address----");
	
	patient.setAddress(sc.next());
	
	System.out.println("----Enter the patient phn no----");
	
	patient.setPhone(sc.nextLong());
	
	PatientDao dao=new PatientDao();
	dao.SavePatient(patient);
}
}
