package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Disha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person person=new Person();
		person.setPersonId(3);
		person.setPersonName("sam");
		person.setPersonGender("Male");
		person.setPersonPhone(87334523451l);
		
		PanCard pCard=new PanCard();
		pCard.setPid(3);
		pCard.setPno(5541111111l);
		pCard.setPaddress("Rachi");
		
		//Relationship or Mapping
		
				person.setpCard(pCard);
				et.begin();
				em.merge(person);
				em.merge(pCard);
				et.commit();
	}
}
