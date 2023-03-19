
package com.jsp.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.jsp.dto.Employee;
public class EmployeeDao {
		static String url="jdbc:mysql://localhost:3306/bank";
		static String un="root";
		static String pwd="Shruti@223";
		
	public void SaveEmployee(Employee emp) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,un,pwd);
		PreparedStatement state=con.prepareStatement("insert into bankdata values(?,?,?)");
		state.setInt(1, emp.getId());
		state.setString(2, emp.getName());
		state.setString(3, emp.getAddress());
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
	public void UpdateEmployee(Employee emp) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, un, pwd);
			PreparedStatement preparedStatement = con.prepareStatement("update bankdata set name=?,address=? where id=?");
			preparedStatement.setString(1, emp.getName());
			preparedStatement.setString(2, emp.getAddress());
			preparedStatement.setInt(3, emp.getId());
			
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
	public void GetEmployee() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, un, pwd);
			PreparedStatement preparedStatement = con.prepareStatement("Select * from bankdata");
			
			ResultSet resultset=preparedStatement.executeQuery();
			
			while(resultset.next()) {
				System.out.println("---------------------------");
				System.out.println("Employee Id is "+resultset.getInt(1));
				System.out.println("Bank Name is "+resultset.getString(2));
				System.out.println("Bank Address is "+resultset.getString(3));
				System.out.println("--------------------------------");
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
	}
	public void DeleteEmployee(Employee emp) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, un, pwd);
			PreparedStatement preparedStatement = con.prepareStatement("Delete from bankdata where id=?");
			/*preparedStatement.setString(1, patient.getName());
			preparedStatement.setString(2, patient.getAddress());
			preparedStatement.setLong(3, patient.getPhone());*/
			preparedStatement.setInt(1, emp.getId());
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
	public Employee GetById(int id){
		Employee emp=new Employee();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, un, pwd);
			PreparedStatement preparedStatement = con.prepareStatement("Select * from bankdata where id=?");
			preparedStatement.setInt(1, id);
			ResultSet resultset=preparedStatement.executeQuery();
			while(resultset.next()) {
				System.out.println("---------------------------");
				int id1=resultset.getInt(1);
				String name=resultset.getString(2);
				String address=resultset.getString(3);
				emp.setId(id1);
				emp.setName(name);
				emp.setAddress(address);
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
	 return emp;
		
	}
	}

