package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Dec21 {
public static void main(String[] args) {
	System.out.println("***Main Starts***");
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","Shruti@223");
		PreparedStatement state=con.prepareStatement("insert into bankdetails values(?,?,?)");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the bank details:");
		for (int i = 1; i <= 2; i++) {
		System.out.println("Enter the id-");
		int x=sc.nextInt();
		System.out.println("Enter the name-");
		String y=sc.next();
		System.out.println("Enter the branch-");
		String z=sc.next();
		state.setInt(1, x);
		state.setString(2, y);
		state.setString(3,z);
		state.addBatch();
		}
		state.executeBatch();
		state.close();
		con.close();
	}
	catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
	catch(SQLException e) {
		e.printStackTrace();	
	}
}
}
