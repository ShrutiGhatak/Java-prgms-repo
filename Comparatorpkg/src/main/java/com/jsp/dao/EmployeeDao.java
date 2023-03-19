package com.jsp.dao;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Employee;

public class EmployeeDao {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Disha");
	EntityManager em=emf.createEntityManager();
	
	public void Save(List<Employee>list) {
		EntityTransaction et=em.getTransaction();
		Comparator<Employee>c1=new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				return o1.getId()-o2.getId();
			}
		};
		Collections.sort(list,c1);
		et.begin();
		for (Employee emp:list) {
			em.persist(emp);
			
		}
		et.commit();
		
	}
	public int Update(int id,Employee e) {
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.merge(e);
		et.commit();
		return id;
	}
	public List<Employee> GetSpecificId() {
		Query q=em.createQuery("select e from empdetails e");
		List<Employee>l=q.getResultList();
		return l;
	
	}
	public Employee GetById(int id) {
		EntityTransaction et=em.getTransaction();
		et.begin();
		Employee emp=em.find(Employee.class, id);
		et.commit();
		return emp;
	}
	public void Del(List<Employee>emp) {
		EntityTransaction et=em.getTransaction();
		Query q=em.createQuery("Delete from empdetails");
		
		et.begin();
		em.remove(emp);
		et.commit();
		
	}
	public Employee DelById(int id) {
		EntityTransaction et=em.getTransaction();
		Employee emp=em.find(Employee.class, id);
		if (emp!=null) {
			et.begin();
			em.remove(emp);
			et.commit();
		}
		
		return null;
	}
	public List<Employee> GetAll(List<Employee> l){
		Query q=em.createQuery("Select s from empdetails s");
		List<Employee> e1=q.getResultList();
//		Comparator<Employee>c2=new Comparator<Employee>() {
//		
//			public int compare(Employee o1, Employee o2) {
//			return o1.getId()-o2.getId();
//			
//		}
//	};
//	Collections.sort(e1,c2);
	return e1;
}
}
