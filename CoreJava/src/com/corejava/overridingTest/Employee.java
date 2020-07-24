package com.corejava.overridingTest;

public class Employee {
	private String name;
	private int age;

	public void displayClassName() {
		System.out.println("Employee class method invoked");
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

}
