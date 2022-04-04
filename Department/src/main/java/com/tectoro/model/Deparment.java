package com.tectoro.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Deparment {
	@Id
	private int roll;
	private String name;
	private String department;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	
	public Deparment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public Deparment(int roll, String name, String department) {
		super();
		this.roll = roll;
		this.name = name;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Deparment [roll=" + roll + ", name=" + name + ", department=" + department + "]";
	}
	

}
