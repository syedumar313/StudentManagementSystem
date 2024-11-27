package com.students.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	int univId;
	String name;
	String email;
	String branch;
	String address;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int univId, String name, String email, String branch, String address) {
		super();
		this.univId = univId;
		this.name = name;
		this.email = email;
		this.branch = branch;
		this.address = address;
	}
	public int getUnivId() {
		return univId;
	}
	public void setUnivId(int univId) {
		this.univId = univId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [univId=" + univId + ", name=" + name + ", email=" + email + ", branch=" + branch + ", address="
				+ address + "]";
	}
	
}
