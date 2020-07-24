package com.corejava.newoops;

public class Human {
	private String name;
	private int age;

	public void displayClass() {
		System.out.println("Human class method called");
	}

	public Human(String name, int age) {
		super();
		System.out.println("Human class constructor invoked");
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "name: " + getName() + " age: " + getAge();
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