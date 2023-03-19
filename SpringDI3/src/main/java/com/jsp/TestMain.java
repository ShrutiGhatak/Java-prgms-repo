package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
		
		Person e=(Person)context.getBean("myEmp");
		Person e1=(Person)context.getBean("myEmp1");
		
		System.out.println(e);
		System.out.println(e1);
	}
}
