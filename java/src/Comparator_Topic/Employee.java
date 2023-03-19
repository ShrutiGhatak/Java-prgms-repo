package Comparator_Topic;

import java.time.LocalDate;
public class Employee {

	private int id;
	private String name;
	private long salary;
	private LocalDate joinDate;
	
	public int getId() {
		return id;
	}
	public Employee(int id, String name, long salary, LocalDate joinDate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joinDate = joinDate;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	public LocalDate getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", joinDate=" + joinDate + "]";
	}

}

