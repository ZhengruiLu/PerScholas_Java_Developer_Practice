package jpa.dao;

import java.sql.SQLException;
import java.util.List;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public interface StudentDAO {
	enum SQL{
		//logs student using email and password:
		GET_STUDENT_LOGIN("SELECT * FROM student WHERE email=? AND password=?"),
		GET_STUDENT_LIST("SELECT * FROM student"),
		FIND_STUDENT_BY_EMAIL("SELECT * FROM student WHERE email=?"),
		FIND_STUDENT_BY_NAME("SELECT * FROM student WHERE name=?");
		
		private final String query;
		
		private SQL(String s) {
			query=s;
		}
		
		public String getQuery() {
			return query;
		}	
	}
	
	List<Student> getAllStudents() throws SQLException;

	Student getStudentByEmail(String sEmail) throws SQLException;
	
	//Method that validates login info:
	boolean validateStudent(String sEmail, String sPassword) throws SQLException, SQLException;

	void registerStudentToCourse(String sEmail, int cId) throws SQLException, SQLException;
	
	List<Course> getStudentCourses(String sEmail) throws SQLException;
}
