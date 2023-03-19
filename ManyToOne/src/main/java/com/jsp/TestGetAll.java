package com.jsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAll {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Disha");
		EntityManager em = emf.createEntityManager();
		
		Query q=em.createQuery("select s from Branch s");
		List<Branch>b=q.getResultList();
		
		for (Branch b1:b) {
			System.out.println("----------------------------");
			System.out.println("BranchId-"+b1.getId());
			System.out.println("BranchName-"+b1.getName());
			System.out.println("BranchAddress-"+b1.getAddress());
			
			Hospital h=b1.getHospital();
			System.out.println("----------------------------");
			System.out.println("HospitalId-"+h.getId());
			System.out.println("HospitalName-"+h.getName());
			System.out.println("HospitalAddress-"+h.getAddress());
			
		}
	}
}
