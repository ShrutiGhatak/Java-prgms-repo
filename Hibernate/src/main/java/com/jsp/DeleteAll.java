package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteAll {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
	
	EntityManager em=emf.createEntityManager();
	
	EntityTransaction et=em.getTransaction();
	
	et.begin();
	
	Query query= em.createQuery("delete from studentdetails");
	query.executeUpdate();
	et.commit();//to save the data
}

}
