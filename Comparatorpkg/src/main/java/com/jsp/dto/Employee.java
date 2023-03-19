package com.jsp.dto;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name = "empdetails")
public class Employee {

	@Id
	
	private int id;
	private String name;
	private double salary;
	private LocalDate joinDate;
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", joinDate=" + joinDate + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee(int id, String name, double salary, LocalDate joinDate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joinDate = joinDate;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}
}
