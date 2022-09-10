package jpa.entitymodels;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")

public class Student {
    private String sEmail;
    private String sName;
    private String sPass;
    private List<Course> sCourses;

    public Student() {
		sEmail = "N/A";
		sName = "N/A";
		sPass = "N/A";
		sCourses = new ArrayList<Course>();
	}

	public Student(String sEmail, String sName, String sPass, List<Course> sCourses) {
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPass = sPass;
		this.sCourses = sCourses;
	}

@Column(name = "email")
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

	public String getsEmail() {
		return sEmail;
	}
	
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	
	public String getsName() {
		return sName;
	}
	
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	public String getsPass() {
		return sPass;
	}
	
	public void setsPass(String sPass) {
		this.sPass = sPass;
	}

	public List<Course> getsCourses() {
		return sCourses;
	}

	public void setsCourses(List<Course> sCourses) {
		this.sCourses = sCourses;
	}
	
	

}
