package com.corejava.collections;

public class Employee {
	private int age;

	public Employee(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		return this.age == (((Employee) obj).getAge());
	}

	@Override
	public int hashCode() {
		return this.age;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + "]";
	}

}
