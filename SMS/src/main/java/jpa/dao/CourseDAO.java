package jpa.dao;

import java.sql.SQLException;
import java.util.List;

import jpa.entitymodels.Course;

public interface CourseDAO {
	enum SQL2{
		GET_COURSE_LIST("SELECT * FROM course"),
		FIND_COURSE_BY_ID("SELECT * FROM course WHERE id=?"),
		FIND_COURSE_BY_NAME("SELECT * FROM course WHERE name=?"),
		FIND_COURSE_BY_INSTRUCTOR("SELECT * FROM course WHERE instructor=?");
		
		private final String query;
		
		private SQL2(String s) {
			query=s;
		}
		
		public String getQuery() {
			return query;
		}	
	}
	
	List<Course> getAllCourses() throws SQLException;
}
