package com.self.corejava;

public class Dog extends Animal {

	private String name;

	@Override
	public void eat() {
		System.out.println("eat method of dog class called");
	}

	{
		System.out.println("init block of dog");
	}

	static {
		System.out.println("static block of dog");
	}

	public Dog() {
		System.out.println("dog property:" + this.name);
		System.out.println("Dog constructor called");
	}

}
