package com.jsp.controller;

import java.util.Scanner;


import com.jsp.dao.PatientDao;
import com.jsp.dto.Patient;

public class TestUpdate {
public static void main(String[] args) {
	
	Patient patient= new Patient();
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("-----Enter the patient details to be updated----");
	
	System.out.println("Enter the patient id to be updated -");
	
	patient.setId(sc.nextInt());
	
	System.out.println("Enter the patient name-");
	
	patient.setName(sc.next());
	
	System.out.println("Enter the patient address-");
	
	patient.setAddress(sc.next());
	
	System.out.println("Enter the patien phn no-");
	
	patient.setPhone(sc.nextLong());
	
	PatientDao dao=new PatientDao();
	dao.UpdatePatient(patient);
}
}
