package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Get {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
System.out.println("***Main Starts***");
	
	//Step-1:Load & Register
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	//Step-2:Establish the Connection
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Shruti@223");
	
	//Step-3:Create a Statement
	
	Statement state=con.createStatement();
	
	//Step-4:Execute the Statement
	
	ResultSet resultset=state.executeQuery("select * from schooldetails");
	
	//Step-5:Process the Result
	
	while(resultset.next()) {
	System.out.println("-------------------------------------------");
	System.out.println("Student Id is "+resultset.getInt(1));
	System.out.println("Course Name is "+resultset.getString(2));
	//System.out.println("Bank Branch is "+resultset.getString(3));
	}
	//Step-6:Close the DB Connection
	
	state.close();
	con.close();
	
	System.out.println("***Main Ends***");
}
}
