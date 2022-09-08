package com.perscholas.practice;
import java.sql.*;

public class MySQLDemo {

	public static void main (String[] args) throws Exception {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:8081/classicmodels?user=root&password=ChangChang@1");

		// using PreparedStatement
		String SelectSQL = "select * from employees where employeeNumber = ?";
		PreparedStatement mystmt = conn.prepareStatement(SelectSQL);
		mystmt.setInt(1, 1002);
		ResultSet result = mystmt.executeQuery();
		
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
