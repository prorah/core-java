package com.corejava.newoops;

public class Employee extends Human {

	public Employee(String name, int age) {
		super(name, age);
		System.out.println("employee class constructor invoked");
	}

	@Override
	public void displayClass() {
		System.out.println("method in employee class");
	}

	@Override
	public String toString() {
		return "name: "+getName()+" age: "+getAge();
	}
	
	

}
