package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetById {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Disha");
		EntityManager em = emf.createEntityManager();
		//EntityTransaction et=em.getTransaction();
		
		Branch branch1=em.find(Branch.class, 1);
		
		Branch branch2=em.find(Branch.class, 2);
		
		Branch branch3=em.find(Branch.class, 3);
		
		if (branch1!=null && branch2!=null && branch3!=null) {
			System.out.println(branch1.getId()+" "+branch1.getName()+" "+branch1.getAddress());
			System.out.println(branch2.getId()+" "+branch2.getName()+" "+branch2.getAddress());
			System.out.println(branch3.getId()+" "+branch3.getName()+" "+branch3.getAddress());
			
			School h=branch1.getSchool();
			System.out.println(h.getId()+" "+h.getName()+" "+h.getAddress());
		}
	}
}
