package jpa.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import jpa.dao.AbstractDAO;
import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class StudentService extends AbstractDAO implements StudentDAO{

	public List<Student> getAllStudents() throws SQLException {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<Student>();

		try {
			connect();
			ps=conn.prepareStatement(SQL.GET_STUDENT_LIST.getQuery());
			rs= ps.executeQuery();
			while(rs.next()) {
				iterateStudents(rs, students);
			}
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			dispose();
		}
		
		return students;
	}

	public Student getStudentByEmail(String sEmail) throws SQLException {
		// TODO Auto-generated method stub
		Student stu = new Student();
		try {
			connect();
			this.ps = conn.prepareStatement(SQL.FIND_STUDENT_BY_EMAIL.getQuery());
			this.ps.setString(1,  sEmail);
			rs=ps.executeQuery();
			if (rs.next()) {
				stu.setsEmail(rs.getString(1));
				stu.setsName(rs.getString(2));
				stu.setsPass(rs.getString(3));
			}			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dispose();
		}
		return stu;
	}

	public boolean validateStudent(String sEmail, String sPassword) throws SQLException, SQLException {
		// TODO Auto-generated method stub
		boolean canLogin=false;
		try {
			connect();
			this.ps=conn.prepareStatement(SQL.GET_STUDENT_LOGIN.getQuery());
			this.ps.setString(1,sEmail);
			this.ps.setString(2, sPassword);
			this.rs = ps.executeQuery();
			if (this.rs.next()) {
				canLogin=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dispose();
		}
		return canLogin;
	}

	public void registerStudentToCourse(String sEmail, int cId) throws SQLException, SQLException {
		// TODO Auto-generated method stub
		
	}

	public List<Course> getStudentCourses(String sEmail) throws SQLException {
		// TODO Auto-generated method stub
		List<Course> courses = new ArrayList<Course>();

		try {
			connect();
			ps=conn.prepareStatement(SQL.FIND_STUDENT_BY_EMAIL.getQuery());
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
	
	

	public void iterateStudents(ResultSet rs, List<Student> temp) throws SQLException {
		while (rs.next()) {
			Student stu = new Student();
			stu.setsEmail(rs.getString(1));
			stu.setsName(rs.getString(2));
			stu.setsPass(rs.getString(3));
			temp.add(stu);
		}
		
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
