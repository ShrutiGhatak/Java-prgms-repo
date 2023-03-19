package Comparator_Topic;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> l1= new ArrayList();
		l1.add(new Employee(102,"Tony",(long) 871000.0010,LocalDate.of(2019, 07, 17)));
		l1.add(new Employee(120,"Toy",(long) 87000.0001,LocalDate.of(2018, 07, 17)));
		l1.add(new Employee(107,"Tom",(long) 8000.02,LocalDate.of(2022, 07, 17)));
		System.out.println(l1);
		
		System.out.println("**************************CustomiseSorting*****************************");
		
		Comparator<Employee> c1= new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
//				return o1.getId()-o2.getId();
				return o1.getId()-o2.getId();  //ascending order
			}
		};
		Collections.sort(l1,c1);
		System.out.println("sort by asscending"+l1);

	
	Comparator<Employee> c2= new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			return o2.getId()-o1.getId();  //descending order
		}
	};
	Collections.sort(l1,c2);
		System.out.println("sort by desscending"+l1);
		
		Comparator<Employee> c3= new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2){
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(l1,c3);
		System.out.println(l1);
		
		Comparator<Employee> c4= new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				return o2.getName().compareTo(o1.getName());
			}
		};
		Collections.sort(l1,c4);
		System.out.println(l1);
		
		Comparator<Employee> c5= new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				return o1.getJoinDate().compareTo(o2.getJoinDate());
			}
		};
		Collections.sort(l1,c5);
		System.out.println(l1);
		
		Comparator<Employee> c6= new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				return o2.getJoinDate().compareTo(o1.getJoinDate());
			}
		};
		Collections.sort(l1,c6);
		System.out.println(l1);
//		
//		Comparator<Employee> c7= new Comparator<Employee>() {
//			public int compare(Employee o1, Employee o2) {
//				return (int)( o1.getSalary()-o2.getSalary());
//			}
//		};
//		Collections.sort(l1,c7);
//		System.out.println(l1);
//		
		Comparator<Employee> aSal = new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				return o1.getSalary() < o2.getSalary() ? -1 : o2.getSalary() > o1.getSalary() ? 1 : 0;
			}
		};

		Comparator<Employee> dSal = new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				return o1.getSalary() > o2.getSalary() ? -1 : o2.getSalary() < o1.getSalary() ? 1 : 0;
			}
		};
	}
}

