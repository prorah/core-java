package com.test.serialization;

public class Human {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Human(){}

	public Human(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + "]";
	}

}
