package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.Hospital;
import com.jsp.dto.Bank;
import com.jsp.dto.Branch;

public class BankBranchDao {


	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void Save(Branch b11,Branch b12,Branch b13) {
		et.begin();
		em.persist(b11);
		em.persist(b12);
		em.persist(b13);
		et.commit();
	}
	public void Update(Branch b11,Branch b12,Branch b13) {
		et.begin();
		em.merge(b11);
		em.merge(b12);
		em.merge(b13);
		et.commit();
	}
	public void GetById(int id1,int id2,int id3) {
		
        Branch branch1=em.find(Branch.class, id1);
		
		Branch branch2=em.find(Branch.class, id2);
		
		Branch branch3=em.find(Branch.class, id3);
        
        if (branch1!=null && branch2!=null && branch3!=null) {
        	System.out.println(branch1.getId()+" "+branch1.getName()+" "+branch1.getAddress());
        	System.out.println(branch2.getId()+" "+branch2.getName()+" "+branch2.getAddress());
        	System.out.println(branch3.getId()+" "+branch3.getName()+" "+branch3.getAddress());
        	
        	Bank b=branch1.getBank();
        	System.out.println(b.getId()+" "+b.getName()+" "+b.getAddress());
		}
	}
	public void GetAll() {
		
		Query q=em.createQuery("select s from Branch s");
		List<Branch>b=q.getResultList();
		
		for (Branch b1:b) {
			System.out.println("----------------------------");
			System.out.println("BranchId-"+b1.getId());
			System.out.println("BranchName-"+b1.getName());
			System.out.println("BranchAddress-"+b1.getAddress());
			
			Bank h=b1.getBank();
			System.out.println("----------------------------");
			System.out.println("BankId-"+h.getId());
			System.out.println("BankName-"+h.getName());
			System.out.println("BankAddress-"+h.getAddress());
			
		}
	}
	public void DelById(int id1,int id2,int id3) {
		
		    Branch branch1=em.find(Branch.class, id1);
			
			Branch branch2=em.find(Branch.class, id2);
			
			Branch branch3=em.find(Branch.class, id3);
	        
			    et.begin();
				em.remove(branch1);
				em.remove(branch2);
				em.remove(branch3);
			    et.commit();
	}
	public void DelAll() {
		
		Query q=em.createQuery("delete from Branch");
		et.begin();
		int n=q.executeUpdate();
		et.commit();
		
		Query q1=em.createQuery("delete from Bank");
		et.begin();
		int m=q1.executeUpdate();
		et.commit();
	}
}
