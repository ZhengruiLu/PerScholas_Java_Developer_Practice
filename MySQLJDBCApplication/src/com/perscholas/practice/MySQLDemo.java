package com.perscholas.practice;
import java.sql.*;

public class MySQLDemo {
//	separate class for queries
	public final static String GetEmployeByID="select * from employees where employeeNumber=? ";
	public final static String GetEmployeBySalalry= "select * from employees where salary = ?";
	public final static String GetEmployeByOfficeCode="select * from employees where officeCode=? ";


	public static void main (String[] args) throws Exception {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:8081/classicmodels?user=root&password=ChangChang@1");


		// using PreparedStatement
//		select
//		String SelectSQL = "select * from employees where employeeNumber = ?";
//		PreparedStatement mystmt = conn.prepareStatement(SelectSQL);
//		mystmt.setInt(1, 1002);
//		ResultSet result = mystmt.executeQuery();
		
//		delete
//		String SelectSQL = "delete from employees where salary > ? and department = ?";
//		PreparedStatement mystmt = conn.prepareStatement(SelectSQL);
//		mystmt.setDouble(1, 80000);
//		mystmt.setString(2, "Legal");
//		ResultSet result = mystmt.executeQuery();
		
//		Update
//		String SelectSQL = "update employees set firstName=? , lastName=? where employeeNumber=?";
//		PreparedStatement mystmt = conn.prepareStatement(SelectSQL);
//		mystmt.setString(1, "Gary");
//		mystmt.setString(2, "Larson");
//		mystmt.setLong(3, 1002);
//		mystmt.executeUpdate();
//		----------------------------------------------------		
//		Separate Class for Queries
//		PreparedStatement mystmt = conn.prepareStatement(MySQLDemo.GetEmployeByID);
//		mystmt.setInt(1, 1002);
//		ResultSet result = mystmt.executeQuery();
//		----------------------------------------------------		
//		practice
		PreparedStatement mystmt = conn.prepareStatement(MySQLDemo.GetEmployeByOfficeCode);
//		mystmt.setInt(1, 1);
		mystmt.setInt(1, 4);
		ResultSet result = mystmt.executeQuery();
//	----------------------------------------------------
//		hard coding SQL values
//		String SelectSQL = "Select * FROM employees";
//		Statement stmt = conn.createStatement();
//		ResultSet result =  stmt.executeQuery(SelectSQL);
		
		while(result.next())
			            {
			            	String name = result.getString("firstName");
			            	String email  = result.getString("email");
			            	System.out.println(name +" | " + email);
			            }

	}


}
