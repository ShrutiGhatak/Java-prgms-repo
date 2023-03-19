package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.jsp.dto.Person;
import com.jsp.dto.VoterCard;

public class PVDao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void SaveData(Person p1,VoterCard vc1) {
		
		et.begin();
		em.persist(p1);
		em.persist(vc1);
		et.commit();
	}
public void UpdateData(Person p1,VoterCard vc1) {
		
		et.begin();
		em.merge(p1);
		em.merge(vc1);
		et.commit();
	}
public void GetId(int id) {

	Person p=em.find(Person.class, id);
	System.out.println("-------------------------------");
	
	System.out.println("Person Id-"+p.getId());
	System.out.println("Person Id-"+p.getName());
	System.out.println("Person Id-"+p.getPhone());
	
	System.out.println("---------------------------------");
	
	//mapping
	VoterCard vCard=p.getvCard();
	
	System.out.println("VoterCard Id-"+vCard.getVid());
	System.out.println("VoterCard no-"+vCard.getVno());
	System.out.println("VoterCard address-"+vCard.getVaddress());
	
	System.out.println("------------------------------");
	
	
}
public void DelId(int id) {
	
	Person p=em.find(Person.class, id);
	
	if (p!=null) {
		et.begin();
		em.remove(p);
		et.commit();
	}
	
	VoterCard v=p.getvCard();
	
	if (v!=null) {
		et.begin();
		em.remove(v);
		et.commit();
		
	}
}
public void GetAll() {
	
	Query q=em.createQuery("Select s from persondata s");
	List<Person>p=q.getResultList();
	for (Person p1:p) {
		System.out.println("-------------------------------");
		System.out.println("Person Id-"+p1.getId());
		System.out.println("Person Name-"+p1.getName());
		System.out.println("Person Phone-"+p1.getPhone());
		
		VoterCard vCard=p1.getvCard();
		System.out.println("VoterCard Id-"+vCard.getVid());
		System.out.println("VoterCard address-"+vCard.getVaddress());
		System.out.println("VoterCard no-"+vCard.getVno());
		
	}
	
}
public void DelAll() {
	
	Query q=em.createQuery("Delete from persondata");
	et.begin();
	int n=q.executeUpdate();
	et.commit();
	
	Query q1=em.createQuery("delete from votercard");
	
	et.begin();
	int m=q1.executeUpdate();
	et.commit();
	
	System.out.println("Data deleted successfully");
	
}
}

