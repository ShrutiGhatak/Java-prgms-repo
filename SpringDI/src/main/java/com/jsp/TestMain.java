package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
		
		Employee emp = (Employee)context.getBean("myEmp");
		System.out.println(emp);
	}
}
