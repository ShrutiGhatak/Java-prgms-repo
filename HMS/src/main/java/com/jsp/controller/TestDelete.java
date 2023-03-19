package com.jsp.controller;

import java.util.Scanner;

import com.jsp.dao.PatientDao;
import com.jsp.dto.Patient;

public class TestDelete {
	public static void main(String[] args) {
		Patient patient = new Patient();
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------Enter the Patient id to be deleted------------------");
		patient.setId(sc.nextInt());

		PatientDao dao = new PatientDao();
		dao.DeletePatient(patient);
	}
}
