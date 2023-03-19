package com.jsp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jsp.dao.StdCoursDao;
import com.jsp.dto.Course;
import com.jsp.dto.Student;

public class TestUpdate {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		System.out.println("Enter the sid1 to be updated");
		s.setId(sc.nextInt());
		System.out.println("Enter the name of student1");
		s.setName(sc.next());
		System.out.println("Enter the address of student1");
		s.setAddress(sc.next());
		
		Student s1=new Student();
		System.out.println("Enter the sid2 to be updated");
		s1.setId(sc.nextInt());
		System.out.println("Enter the name of student2");
		s1.setName(sc.next());
		System.out.println("Enter the address of student2");
		s1.setAddress(sc.next());
		
		Course c1=new Course();
		System.out.println("Enter the cid1 to be updated");
		c1.setId(sc.nextInt());
		System.out.println("Enter the name of course1");
		c1.setCoursename(sc.next());
		System.out.println("Enter the duration of course1");
		c1.setDuration(sc.next());
		
		Course c2=new Course();
		System.out.println("Enter the cid2 to be updated");
		c2.setId(sc.nextInt());
		System.out.println("Enter the name of course2");
		c2.setCoursename(sc.next());
		System.out.println("Enter the duration of course2");
		c2.setDuration(sc.next());
		
		Course c3=new Course();
		System.out.println("Enter the cid3 to be updated");
		c3.setId(sc.nextInt());
		System.out.println("Enter the name of course3");
		c3.setCoursename(sc.next());
		System.out.println("Enter the duration of course3");
		c3.setDuration(sc.next());
		
		Course c4=new Course();
		System.out.println("Enter the cid4 to be updated");
		c4.setId(sc.nextInt());
		System.out.println("Enter the name of course4");
		c4.setCoursename(sc.next());
		System.out.println("Enter the duration of course4");
		c4.setDuration(sc.next());
		
		List<Course> l1=new ArrayList<Course>();
		l1.add(c1);
		l1.add(c2);
		
		List<Course> l2=new ArrayList<Course>();
		l2.add(c3);
		l2.add(c4);
		
		s.setCourses(l1);
		s1.setCourses(l2);
		
		StdCoursDao dao=new StdCoursDao();
		dao.Update(s, s1);
	}
}
