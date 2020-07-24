package com.java.collections;

public class Employee implements Comparable<Employee> {

	private String name;
	private String designation;
	private int age;

	public Employee(String name, String designation, int age) {
		super();
		this.name = name;
		this.designation = designation;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Employee arg0) {
		if (this.age > arg0.age) {
			return 1;
		} else if (this.age < arg0.age) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object arg0) {
		return this.designation.length() == ((Employee) arg0).designation.length();
	}

	@Override
	public int hashCode() {
		return this.designation.length();
	}

}
