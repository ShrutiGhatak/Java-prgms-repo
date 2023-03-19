package com.jsp.controller;

import java.util.List;


import com.jsp.dao.PatientDao;
import com.jsp.dto.Patient;

public class TestGet {
	
public static void main(String[] args) {
	
	PatientDao dao=new PatientDao();
	List<Patient> p1=dao.GetPatient();
	for (Patient patients:p1) {
		System.out.println("-----------------------------------------");
		System.out.println("Patient id is "+patients.getId());
		System.out.println("Patient name is "+patients.getName());
		System.out.println("Patient address is "+patients.getAddress());
		System.out.println("Patient phone is "+patients.getPhone());
		System.out.println("------------------------------------------");
	}
}
}
