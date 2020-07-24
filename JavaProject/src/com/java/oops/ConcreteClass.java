package com.java.oops;

public class ConcreteClass extends AbstractClassEmployee {

	private String name;
	private int age;

	@Override
	public void getName() {
		System.out.println("name method invoked");
	}

	public void getAge() {
		System.out.println("Age method of concrete class called");
	}

	public ConcreteClass() {

	}

	public ConcreteClass(String name, int age) {
		this();
		this.name = name;
		this.age = age;
	}
}
