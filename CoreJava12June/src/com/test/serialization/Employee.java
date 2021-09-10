package com.test.serialization;

import java.io.Serializable;

public class Employee extends Human implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int age;
	private int employeeid;

	@Override
	public String toString() {
		return "Employee [age=" + age + ", employeeid=" + employeeid + "]";
	}
	
	

	public Employee(int age, int employeeid) {
		this.age = age;
		this.employeeid = employeeid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getAge() {
		return age;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

}
