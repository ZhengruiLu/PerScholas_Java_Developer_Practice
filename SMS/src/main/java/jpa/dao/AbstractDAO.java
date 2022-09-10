package jpa.dao;
import java.sql.*;

public class AbstractDAO {
	private final String URL =  "jdbc:mariadb://localhost:8081/school_management_system"; 
	private final String USER = "root";
	private final String PASS = "pleaseEnterYourPassWord";
	private final Driver DRIVER = new org.mariadb.jdbc.Driver();
	
	protected Connection conn=null;
	protected PreparedStatement ps = null;
	protected ResultSet rs = null;
	 
	public void connect() throws Exception{
		try {
			DriverManager.registerDriver(DRIVER);
			conn= DriverManager.getConnection(URL,USER,PASS);
		} catch  (SQLException e){
			throw new Exception(e.getMessage());
		}
	}
	
	public void dispose() throws SQLException {
		try {
			if(!rs.equals(null)) {
				if(!rs.isClosed()) rs.close();
			}
			if(!ps.equals(null)) {
				if(!ps.isClosed()) ps.close();
			}
			if(!conn.equals(null)) {
				if(!conn.isClosed()) conn.close();
			}
		} catch (SQLException e) {
			
		} finally {
			rs.close();
			ps.close();
			conn.close();
		}
	}
}
