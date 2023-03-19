package com.jsp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MultipledataInsert {
public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
	//Step-1:Load & Register
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step-2:Establish the Connection
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/doctors","root","Shruti@223");
		
		PreparedStatement state=con.prepareStatement("insert into doctordetails values(?,?,?)");
		Scanner sc=new Scanner(System.in);
		System.out.println("***Enter the Doctor Details***");
		for(int i=1;i<=3;i++) {
		Thread.sleep(1000);
		System.out.println("Enter doctor id");
		int x=sc.nextInt();
		System.out.println("Enter doctor name");
		String y=sc.next();
		System.out.println("Enter doctor specialization");
		String z=sc.next();
		state.setInt(1, x);
		state.setString(2, y);
		state.setString(3, z);
		boolean b=state.execute();
		}
		System.out.println("Data added Successfully");
		state.close();
		con.close();
		
	}
}
