package com.demo.collections;

public class Employee implements Comparable<Employee> {

	private String name;
	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

	// Getter and Setter methods
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

	@Override
	public int compareTo(Employee o) {
		if (this.age < o.getAge()) {
			return 1;
		} else if (this.age > o.getAge()) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public int hashCode() {
		return age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else {
			return false;
		}
	}

}
