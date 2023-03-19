package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMob {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
		
		Mobile m = (Mobile)context.getBean("mymob");
		Mobile m1 = (Mobile)context.getBean("mymob1");
		
		System.out.println(m);
		System.out.println(m1);
	}
}
