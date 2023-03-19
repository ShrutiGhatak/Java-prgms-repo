package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Multipledatainsert {
public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
System.out.println("***Main Starts***");
	
	//Step-1:Load & Register
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	//Step-2:Establish the Connection
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Shruti@223");
	
	PreparedStatement state=con.prepareStatement("insert into coursedetails values(?,?)");
	Scanner sc=new Scanner(System.in);
	System.out.println("***Enter the course Details***");
	for(int i=1;i<=2;i++) {
	Thread.sleep(1000);
	System.out.println("Enter course id");
	int x=sc.nextInt();
	System.out.println("Enter course name");
	String y=sc.next();
	state.setInt(1, x);
	state.setString(2, y);
	boolean b=state.execute();
	}
	System.out.println("Data added Successfully");
	state.close();
	con.close();
}
}
