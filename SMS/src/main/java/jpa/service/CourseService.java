package jpa.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jpa.dao.AbstractDAO;
import jpa.dao.CourseDAO;
import jpa.dao.StudentDAO.SQL;
import jpa.entitymodels.Course;


public class CourseService extends AbstractDAO implements CourseDAO{

	public List<Course> getAllCourses() throws SQLException {
		// TODO Auto-generated method stub
		List<Course> courses = new ArrayList<Course>();

		try {
			connect();
			ps=conn.prepareStatement(SQL.GET_STUDENT_LIST.getQuery());
			rs= ps.executeQuery();
			while(rs.next()) {
				iterateCourses(rs, courses);
			}
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			dispose();
		}
		
		return courses;
	}
	
	private void iterateCourses(ResultSet rs, List<Course> temp) throws SQLException {
		// TODO Auto-generated method stub
		while (rs.next()) {
			Course course = new Course();
			course.setcId(rs.getInt(1));
			course.setcName(rs.getString(2));
			course.setcInstructorName(rs.getString(3));
			temp.add(course);
		}
		
	}

}
