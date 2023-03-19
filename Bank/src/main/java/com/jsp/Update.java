package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.println("***Main Starts***");
		
		//Step-1:Load & Register
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step-2:Establish the Connection
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","Shruti@223");
		
		//Step-3:Create a Statement
		
		Statement state=con.createStatement();
		
		//Step-4:Execute the Statement
		int x=state.executeUpdate("Update bankdetails set branch='Bangalore' where id=3");
		
		//Step-5:Process the result
		
		System.out.println(x);
		
		//Step-6:Close the DB Connection
		
		state.close();
		con.close();
		
		System.out.println("***Main Ends***");
	}	
}
