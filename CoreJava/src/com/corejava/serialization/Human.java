package com.corejava.serialization;

public class Human{

	private String gender;
	private int age;

	public Human() {
		System.out.println(this.gender + " " + this.age);
		System.out.println("no argument constructor of Human called");
	}

	{
		System.out.println("Instance init block");
	}

	public Human(String gender, int age) {
		super();
		this.gender = gender;
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
