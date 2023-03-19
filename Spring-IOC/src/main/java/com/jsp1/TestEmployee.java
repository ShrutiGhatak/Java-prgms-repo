package com.jsp1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("Config.xml");
		
		Employee e=(Employee)context.getBean("myEmployee");
		
		System.out.println(e);
	}
}
