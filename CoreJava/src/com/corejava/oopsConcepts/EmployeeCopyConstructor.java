package com.corejava.oopsConcepts;

public class EmployeeCopyConstructor {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// constructor
	public EmployeeCopyConstructor(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// copy constructor
	public EmployeeCopyConstructor(EmployeeCopyConstructor employee) {
		this.name = employee.name;
		this.age = employee.age;
	}

}
