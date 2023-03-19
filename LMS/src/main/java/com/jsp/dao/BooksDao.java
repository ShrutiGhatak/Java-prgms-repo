package com.jsp.dao;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

//import com.jsp.Student;
import com.jsp.dto.Books;

public class BooksDao {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
	EntityManager em=emf.createEntityManager();
	
	public Books SaveBook(Books books) {
		
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.persist(books);
		et.commit();
		
		return books;
	}
	public int UpdateBook(int id,Books books) {
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		
		//merge is going to update the data
		em.merge(books);
		
		et.commit();
		
		return id;
	}
	public Books GetById(int id) {
		Books books=em.find(Books.class,id);
		
		return books;
		
	}
	public Books DeleteById(int id) {
		EntityTransaction et=em.getTransaction();
		Books books=em.find(Books.class, id);
		if (books!=null) {
			et.begin();
			em.remove(books);
			et.commit();
		}
		return null;
	}
}
