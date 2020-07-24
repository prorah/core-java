package com.corejava.serialization;

import java.io.Serializable;

public class Man extends Human implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	public Man() {
		System.out.println("no arg constructor of man called");
	}

	public Man(String gender, int age, String name) {
		super(gender, age);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Man [name=" + name + ", getGender()=" + getGender() + ", getAge()=" + getAge() + "]";
	}

}
