package com.self.corejava;

public class Animal {

	private int age;

	public void eat() {
		System.out.println("animal class method called");
	}

	{
		System.out.println("Animal instance block");
	}

	static {
		System.out.println("static block of animal");
	}

	public Animal() {
		System.out.println("animal property:" + this.age);
		System.out.println("animal constructor called");
	}

}
