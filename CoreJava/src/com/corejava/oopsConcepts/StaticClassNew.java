package com.corejava.oopsConcepts;

public class StaticClassNew {
	public int age = 20;
	public int id = 20;

	public StaticClassNew() {
		System.out.println("constructor invoked");
		age = age + 1;
		id = id + 1;
	}

	public int getNewAge() {
		return age;
	}
}
