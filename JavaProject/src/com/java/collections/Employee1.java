package com.java.collections;

public class Employee1 {
	private int employeeId;
	private String name;
	private int age;

	public Employee1(int employeeId, String name, int age) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee1 [employeeId=" + employeeId + ", name=" + name + ", age=" + age + "]";
	}

}
