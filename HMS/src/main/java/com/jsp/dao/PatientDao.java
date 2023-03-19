package com.jsp.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.dto.Patient;
public class PatientDao {
	static String url="jdbc:mysql://localhost:3306/hospital26";
	static String un="root";
	static String pwd="Shruti@223";
	
public void SavePatient(Patient patient) {
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,un,pwd);
	PreparedStatement state=con.prepareStatement("insert into patientdetails values(?,?,?,?)");
	state.setInt(1, patient.getId());
	state.setString(2, patient.getName());
	state.setString(3, patient.getAddress());
	state.setLong(4, patient.getPhone());
	state.execute();
	System.out.println("Data added successfully");
	state.close();
	con.close();
}
	catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	catch (SQLException e) {
		e.printStackTrace();
	}
}
public void UpdatePatient(Patient patient) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, un, pwd);
		PreparedStatement preparedStatement = con.prepareStatement("update patientdetails set name=?,address=?,phone=? where id=?");
		preparedStatement.setString(1, patient.getName());
		preparedStatement.setString(2, patient.getAddress());
		preparedStatement.setLong(3, patient.getPhone());
		preparedStatement.setInt(4, patient.getId());
		
		int x = preparedStatement.executeUpdate();
		System.out.println(x+"data updated successfully....");
		preparedStatement.close();
		con.close();
	}
	catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	catch (SQLException e) {
		e.printStackTrace();
	}
}
public void DeletePatient(Patient patient) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, un, pwd);
		PreparedStatement preparedStatement = con.prepareStatement("Delete from patientdetails where id=?");
		/*preparedStatement.setString(1, patient.getName());
		preparedStatement.setString(2, patient.getAddress());
		preparedStatement.setLong(3, patient.getPhone());*/
		preparedStatement.setInt(1, patient.getId());
		int x = preparedStatement.executeUpdate();
		System.out.println(x+"data deleted successfully....");
		preparedStatement.close();
		con.close();
	}
	catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	catch (SQLException e) {
		e.printStackTrace();
	}
}
public List<Patient> GetPatient() {
	List<Patient> l1=new ArrayList<Patient>();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, un, pwd);
		PreparedStatement preparedStatement = con.prepareStatement("Select * from patientdetails");
		ResultSet resultset=preparedStatement.executeQuery();
		while(resultset.next()) {
			System.out.println("---------------------------");
			/*System.out.println("Patient Id is "+resultset.getInt(1));
			System.out.println("Patient Name is "+resultset.getString(2));
			System.out.println("Patient Address is "+resultset.getString(3));
			System.out.println("Patient phn no is "+resultset.getLong(4));*/
			System.out.println("--------------------------------");
			int id=resultset.getInt(1);
			String name=resultset.getString(2);
			String address=resultset.getString(3);
			long phone=resultset.getLong(4);
			Patient patient=new Patient();
			patient.setId(id);
			patient.setName(name);
			patient.setAddress(address);
			patient.setPhone(phone);
			//to add Patient's in collection
			l1.add(patient);
		}
		preparedStatement.close();
		con.close();

	}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	 return l1;
}
public Patient GetById(int id){
	Patient patient=new Patient();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, un, pwd);
		PreparedStatement preparedStatement = con.prepareStatement("Select * from patientdetails where id=?");
		preparedStatement.setInt(1, id);
		ResultSet resultset=preparedStatement.executeQuery();
		while(resultset.next()) {
			System.out.println("---------------------------");
			int id1=resultset.getInt(1);
			String name=resultset.getString(2);
			String address=resultset.getString(3);
			long phone=resultset.getLong(4);
			patient.setId(id1);
			patient.setName(name);
			patient.setAddress(address);
			patient.setPhone(phone);
		}
		preparedStatement.close();
		con.close();
	}
	catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	catch (SQLException e) {
		e.printStackTrace();
	}
 return patient;
	
}
}

