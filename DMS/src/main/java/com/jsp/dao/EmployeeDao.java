package com.jsp.dao;

import java.util.List;


import javax.persistence.*;

import com.jsp.dto.Employee;

public class EmployeeDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Disha");
	EntityManager em = emf.createEntityManager();

	public Employee SaveData(Employee emp) {

		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(emp);
		et.commit();
		return emp;

	}

	public int UpdateData(int id, Employee emp) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(emp);
		et.commit();
		return id;

	}

	public Employee GetId(int id) {
		Employee emp = em.find(Employee.class, id);
		return emp;
	}

	public Employee DeleteId(int id) {
		EntityTransaction et = em.getTransaction();
		Employee e1 = em.find(Employee.class, id);
		if (e1 != null) {
			et.begin();
			em.remove(e1);
			et.commit();
		}
		return null;

	}

	public List<Employee> readAll() {
		Query q = em.createQuery("Select s from empdata s");
		List<Employee> l = q.getResultList();
		return l;

	}
	public int RemoveAll() {
		EntityTransaction et=em.getTransaction();
		Query q=em.createQuery("Delete from empdata");
		et.begin();
		int n=q.executeUpdate();
		et.commit();
		return n;
		
	}
}
