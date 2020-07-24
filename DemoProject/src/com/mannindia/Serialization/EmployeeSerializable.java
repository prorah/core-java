package com.mannindia.Serialization;

import java.io.Serializable;

public class EmployeeSerializable implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private int id;
	private transient int salary;
	private String password;

	public EmployeeSerializable(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
