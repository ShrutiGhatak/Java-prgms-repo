package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
		
		Person person = (Person)context.getBean("myPerson");
		Person person1 = (Person)context.getBean("myPerson1");
		
		System.out.println(person);
		System.out.println(person1);
		
	}
}
