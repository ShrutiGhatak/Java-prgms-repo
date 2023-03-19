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
		
		Query q=em.createQuery("select s from branch1 s");
		List<Branch>b=q.getResultList();
		
		for (Branch b1:b) {
			System.out.println("----------------------------");
			System.out.println("BranchId-"+b1.getId());
			System.out.println("BranchName-"+b1.getName());
			System.out.println("BranchAddress-"+b1.getAddress());
			
			School h=b1.getSchool();
			System.out.println("----------------------------");
			System.out.println("SchoollId-"+h.getId());
			System.out.println("SchoolName-"+h.getName());
			System.out.println("SchoollAddress-"+h.getAddress());
			
		}
	}
}
