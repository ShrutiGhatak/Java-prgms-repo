package com.jsp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Demo {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		System.out.println("-----Main starts-----");
		//Step-1:Load and Register Driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
       
        //Step-2:Establish the connection
        
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Shruti@223");
        System.out.println(con);
        
        //Step-3:Create a Statement
        Statement state=con.createStatement();
        System.out.println("-----Main ends----");
	}

}
