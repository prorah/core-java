package com.fis.collections;

public class Employee implements Comparable<Employee> {

	private String name;
	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

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

	public boolean equals(Object o) {
		if (this.name.length() == ((Employee) o).name.length()) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		return name.length();
	}

	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.name.length() > (o.getName().length())) {
			return 1;
		} else if (this.name.length() < (o.getName().length())) {
			return -1;
		} else {
			return 0;
		}

	}

}
