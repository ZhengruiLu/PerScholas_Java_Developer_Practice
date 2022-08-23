package com.test.hib.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DEPT")

public class Department {
	private int did;
	private String name;
	private String state;
	
	public Department(int did, String name, String state) {
		this.did = did;
		this.name = name;
		this.state = state;
	}

	public Department() {
	}
	
	@Column(name = "DEPT_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
